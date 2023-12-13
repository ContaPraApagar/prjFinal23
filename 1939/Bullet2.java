import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet2 extends SBD3
{
    /**
     * Act - do whatever the Bullet2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
         moveAtaque();
        atWorldEdge();
    }
    public void moveAtaque()
    {
    double angle = Math.toRadians(getRotation() );
    int y = (int) Math.round(getY() + Math.cos(angle));
    int x = (int) Math.round(getX() + Math.sin(angle));
    
    setLocation(x,y);
    }
    
      public boolean atWorldEdge()
    {
    if (isAtEdge()) getWorld().removeObject(this);
    return true;
    }
}
