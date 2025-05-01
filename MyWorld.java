import greenfoot.*;

public class MyWorld extends World {
    public int score;
    Label scoreLabel;
    int level = 1;
    public MyWorld() {
        super(600, 400, 1, false);//false= object not bounded to world
        //create elephant
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        //create label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        createApple();
    }
    
    /**
     * Increses score
     */
    public void increaseScore(){
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0){
            level++;
        }
    }
    
    /**
     * game over
     */
    public void gameOver(){
        Label gameOverLabel = new Label("GAME OVER", 100);
        addObject(gameOverLabel, 300, 200);
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
