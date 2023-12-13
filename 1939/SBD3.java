import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SBD3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SBD3 extends Actor
{public int speed = 1;
    public int sTimer= 0;
    public int vida = 2;
    public boolean check = true;
    /**
     * Act - do whatever the SBD3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Avançar();
     int random = Greenfoot.getRandomNumber(1);
        if(random <= 10 && (sTimer==0)){
            sTimer ++;
            getWorld().addObject(new Bullet2(), getX(), getY());
        }
        else{
            if (random <= 1 && (sTimer==0)){
                sTimer = 0;
    }
}
}
    
    public void Avançar(){
        this.setLocation(this.getX(), this.getY()+2);
    }

    }