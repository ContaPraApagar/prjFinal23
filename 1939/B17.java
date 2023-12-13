import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class B17 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class B17 extends Actor
{
    int move = 3;
    int move1 = 3;
    int Vida = 20;
    public void act()
    {
        atWorldEdge();// Add your action code here.
        int random = Greenfoot.getRandomNumber(6);
        if(random >= 3){
            getWorld().addObject(new BigBullet(), getX(), getY());
        }
        
        
        setLocation(getX() + move, getY() + move1);
        if(getX() > 750 || (getX() < 50)){
            move = move * -1; 
            move1 = move * +1;
        }
        
        Actor a= getOneIntersectingObject(Bullet.class);
       if(a != null){
            Vida--;
            getWorld().removeObject(a);
        } else if(Vida == 0){
            getWorld().removeObject(this);
            Vitoria1 world = new Vitoria1();
            Greenfoot.setWorld(world);
        }
    }
     public boolean atWorldEdge()
    {
    if (isAtEdge()) {
        getWorld().removeObject(this);
        }
    return true;
    }
}
