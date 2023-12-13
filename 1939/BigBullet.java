import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BigBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BigBullet extends B17
{
    /**
     * Act - do whatever the BigBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Mover();
        acertarAlvo();
        edge();
    }

    public void Mover(){
        double angle = Math.toRadians( getRotation() );
        int x = (int) Math.round (getX() - Math.cos(angle));
        int y = (int) Math.round (getY() - Math.sin(angle));  
        setLocation(x-01, y+10);
    }
    public void edge(){
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
    public void acertarAlvo(){
        Actor a= getOneIntersectingObject(G50.class);
        
        if(a != null){
           getWorld().removeObject(a);
           Derrota world = new Derrota();
           Greenfoot.setWorld(world);

        }
}
}
