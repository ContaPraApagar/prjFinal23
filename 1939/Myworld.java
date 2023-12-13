import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Myworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Myworld extends World
{
    private GreenfootSound bgMusic = new GreenfootSound("TigerTracks.mp3");
     public void started()
    {
    bgMusic.playLoop();
    }
 
    // class constants
    public static final int WIDE = 800; // world width (viewport)
    public static final int HIGH = 600; // world height (viewport)
    // instance reference field for Scroller object
    private Scroller scroller;
    /** creates the world that will scroll */
    public Myworld()
    {
        super(WIDE, HIGH, 1, false); // create an unbounded world
        GreenfootImage image = new GreenfootImage("Mapa Molde.png"); 
        scroller = new Scroller(this, image); 
        // the background image// create the Scroller object
        prepare();

    }
    
   
    
    public void act(){
        started();
        scroll();
     if(getObjects(SBD3.class).size() < 1){ 
        addObject(new SBD3(), 391,62);
    }
    else if(getObjects(SBD3.class).size() <    2){ 
        addObject(new SBD3(), 530,90);
    } 
    else if(getObjects(SBD3.class).size() <    1){ 
        addObject(new SBD3(), 430,90);
    } 
    else if(getObjects(SBD3.class).size() <    1){ 
        addObject(new SBD3(), 330,90);
    } 
    else if(getObjects(SBD3.class).size() <    1){ 
        addObject(new SBD3(), 230,70);
    } 
    else if(getObjects(SBD3.class).size() < 3){ 
        addObject(new SBD3(), 630,40);
    
    counter();
    
}
}

 public void counter(){
        Counter counter = (Counter) getObjects(Counter.class).get(0);
        if(counter.getValue() ==10){
            addObject(new B17(), 750,100);
        }
    }
    private void scroll()
    {
        int speed = 3;
        scroller.scroll(0, -speed);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        G50 g50 = new G50();
        addObject(g50,384,454);
        HUD HUD = new HUD();
        addObject(HUD,92,562);
        HUD.setLocation(111,571);
        Counter counter = new Counter();
        addObject(counter,111,571);
        SBD3 sBD3 = new SBD3();
        addObject(sBD3,391,62);
        SBD3 sBD32 = new SBD3();
        addObject(sBD32,530,90);
        SBD3 sBD33 = new SBD3();
        addObject(sBD33,163,189);
        SBD3 sBD34 = new SBD3();
        addObject(sBD34,680,119);
        SBD3 sBD35 = new SBD3();
        addObject(sBD35,361,230);
        removeObject(sBD35);
        sBD33.setLocation(140,130);
        sBD33.setLocation(141,128);
    }


}