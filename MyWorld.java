import greenfoot.*;

public class MyWorld extends World {
    public int score;
    Label scoreLabel;
    public MyWorld() {
        super(600, 400, 1);
        //create elephant
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 200);
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
    }
    
    /**
     * Create new apple at random location at top of screen
     */
    public void createApple(){
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        addObject(apple, x, 0);
    }
}
