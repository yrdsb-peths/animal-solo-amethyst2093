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
        if(score == 10){
            gameOver();
        }
    }
    
    /**
     * Increases score
     */
    public void increaseScore(){
        score++;
        scoreLabel.setValue(score);
        if(level < 7){
            level++;
        }
    }
    
    /**
     * game over
     */
    public void gameOver(){
        sonic.stop();
        if(score == 10){
            Label win = new Label("YOU WIN!", 100);
            addObject(win, 300, 200);
        } else {
            Label lose = new Label("TRY AGAIN!", 100);
            addObject(lose, 300, 200);
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
