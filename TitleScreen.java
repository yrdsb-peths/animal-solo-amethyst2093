import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title screen
 * 
 * @author amelieyour name) 
 * @version may 2025
 */
public class TitleScreen extends World
{
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Label titleLabel = new Label("Hungry Elephant", 60);
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
        addObject(elephant,300,200);
        Label label = new Label("use \u2190 and \u2192 to move left and right", 20);
        addObject(label,300,300);
        Label volume = new Label("VOLUME UP", 20);
        addObject(volume,300,350);
    }
}
