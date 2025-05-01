import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title screen
 * 
 * @author amelieyour name) 
 * @version may 2025
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, 100);
        prepare();
    }

    public void act(){
        //start when press spacebar
        if(Greenfoot.isKeyDown("space")){
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,289,161);
        elephant.setLocation(284,208);
        elephant.setLocation(228,236);
        Label label = new Label("use arrow keys to move left and right", 20);
        addObject(label,275,321);
        label.setLocation(305,322);
        label.setLocation(286,322);
        elephant.setLocation(308,198);
        elephant.setLocation(300,199);
        elephant.setLocation(289,199);
        label.setLocation(305,305);
        label.setLocation(365,297);
        label.setLocation(294,312);
    }
}
