import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vitoria1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vitoria1 extends World
{

    /**
     * Constructor for objects of class Vitoria1.
     * 
     */
    public Vitoria1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
    }
     public void act(){

    //Diálogo do personagem 1

        if (Greenfoot.isKeyDown("enter")){
           Vfinal world1 = new Vfinal();
           Greenfoot.setWorld(world1);
        
    }
  
}
}
