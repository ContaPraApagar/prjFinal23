import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MENU here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MENU extends World
{

    /**
     * Constructor for objects of class MENU.
     * 
     */
    public MENU()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
    }
    public void act(){

    //Diálogo do personagem 1

        if (Greenfoot.isKeyDown("enter")){
           Intrucoes world1 = new Intrucoes();
           Greenfoot.setWorld(world1);
        
    }
  
}
}
