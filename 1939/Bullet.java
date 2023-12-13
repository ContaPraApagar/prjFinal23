import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends G50
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        moveAtaque();
        acertarAlvo();
    }
public void moveAtaque()
    {
    double angle = Math.toRadians(getRotation() );
    int y = (int) Math.round(getY() + Math.cos(angle));
    int x = (int) Math.round(getX() + Math.sin(angle));
    
    setLocation(x+0, y -10);
    }
    public void acertarAlvo(){
        Actor a= getOneIntersectingObject(SBD3.class);
        Actor b= getOneIntersectingObject(Bullet2.class);
        if(a != null){
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.add(1);
            getWorld().removeObject(a);
            getWorld().removeObject(this);
            
        } else if (b!= null ){
             getWorld().removeObject(b);
            getWorld().removeObject(this);
        }
        }
    }
        

