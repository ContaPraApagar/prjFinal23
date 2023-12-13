import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dialogo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dialogo extends World
{

    /**
     * Constructor for objects of class Dialogo.
     * 
     */
    public Dialogo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
    }
    public void act(){
     if (Greenfoot.isKeyDown("enter")){
        Myworld world = new Myworld();
        Greenfoot.setWorld(world);
        
        
    }
}
}
