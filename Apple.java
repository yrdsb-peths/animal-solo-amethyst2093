import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for elephant
 * 
 * @author Amelie
 * @version Apr 2025
 */
public class Apple extends Actor
{
    public Apple(){
        GreenfootImage apple = new GreenfootImage("apple.png");
        apple.scale(50, 50);
        setImage(apple);
    }
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // apple fall
        setLocation(getX(), getY() + 5);
        
        //remove when touch bottom -- game over
        MyWorld world = (MyWorld) getWorld();
        if(getY()>= world.getHeight()){
            world.gameOver();
            world.removeObject(this);
        }
    }
}
