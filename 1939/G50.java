import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class G50 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class G50 extends Actor
{public int speed = 4;
    public int sTimer= 0;
    public int Vida = 5;
    /**
     * Act - do whatever the G50 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        movimento();// Add your action code here.
        Actor a= getOneIntersectingObject(BigBullet.class);
        
       if(a != null){
            Vida--;
            getWorld().removeObject(a);
        } else if(Vida == 0){
            getWorld().removeObject(this);
            Vitoria1 world = new Vitoria1();
            Greenfoot.setWorld(world);
        }
}
public void movimento(){
        if (Greenfoot.isKeyDown("w")){
            this.setLocation(this.getX(), this.getY() - speed);
        }
        if (Greenfoot.isKeyDown("s")){
            this.setLocation(this.getX(), this.getY() + speed);
        }
        if (Greenfoot.isKeyDown("a")){
            this.setLocation(this.getX() - speed, this.getY());
        }
        if (Greenfoot.isKeyDown("d")){
            this.setLocation(this.getX() + speed, this.getY() );
        }
    if (Greenfoot.isKeyDown("f") && (sTimer==0)){
        sTimer ++;
            getWorld().addObject(new Bullet(), getX() +1, getY() +1);
        }
        else{
            if (!Greenfoot.isKeyDown("f")){
                sTimer = 0;
            }
    }
    
  }
  public void EnemieHit(){
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
}