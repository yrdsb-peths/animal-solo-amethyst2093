import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Elephant, our hero
 * 
 * @author Amelie 
 * @version Apr 2025
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephant sound.mp3");
    GreenfootImage[] idle = new GreenfootImage[8];
    /**
     * constructor - code gets run first time instance created
     */
    public Elephant(){
        for(int i = 0; i<idle.length; i++){
            idle[i] = new GreenfootImage("images/elephant_idle/idle"+i+".png");
            idle[i].scale(120, 100);
        }
        setImage(idle[0]);
    }
    int imageIndex = 0;
    /**
     * animate elephant
     */
    public void animateElephant(){
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){            move(-5);
        }
        if(Greenfoot.isKeyDown("right")){
            move(5);
        }
        eat();
        animateElephant();
    }
    //remove apples if eaten
    /**
     * Eat and spawn new apple
     */
    public void eat(){
        if(isTouching(Apple.class)){
            removeTouching(Apple.class);
            //get instance of world object is in
            MyWorld world = (MyWorld) getWorld(); 
            world.createApple();
            world.increaseScore();
            elephantSound.play();
        }
    }
}
