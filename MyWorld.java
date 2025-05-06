import greenfoot.*;
import greenfoot.GreenfootSound;

public class MyWorld extends World {
    public int score;
    Label scoreLabel;
    int level = 2;
    GreenfootSound sonic = new GreenfootSound("sonicIdol.mp3");
    public MyWorld() {
        super(600, 400, 1, false);//false= object not bounded to world
        sonic.play();
        //create elephant
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        //create label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        createApple();
    }
    
    /**
     * Increases score
     */
    public void increaseScore(){
        score++;
        scoreLabel.setValue(score);
        if(level < 5){
            level++;
        }
        if(score >= 10){
            gameOver();
        }
    }
    
    /**
     * game over
     */
    public void gameOver(){
        sonic.stop();
        if(score >= 10){
            Label win = new Label("YOU WIN!", 90);
            addObject(win, 300, 100);
            if(score >= 20) {
                removeObject(win);
                Label stop = new Label("stop", 90);
                addObject(stop, 300, 100);
            }
        } else {
            Label lose = new Label("TRY AGAIN!", 90);
            addObject(lose, 300, 100);
        }
    }
    
    /**
     * Create new apple at random location at top of screen
     */
    public void createApple(){
        Apple apple = new Apple();
        apple.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        addObject(apple, x, -20);
    }
}
