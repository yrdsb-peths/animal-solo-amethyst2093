import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stop extends World
{

    /**
     * Constructor for objects of class Stop.
     * 
     */
    public Stop()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Label stop = new Label("stop it.", 90);
        addObject(stop, 300, 150);
        Label help = new Label("get some help", 90);
        addObject(help, 300, 250);
    }
}
