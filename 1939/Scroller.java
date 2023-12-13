import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scroller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scroller
{
private World world; // view window world
private GreenfootImage scrollImage; // scrolling image
private boolean limited; // flag to indicate whether scrolling is limited or not
private int scrolledX, scrolledY; // current scrolled distances
private int wide, high;

public Scroller(World viewWorld, GreenfootImage image)

{
world = viewWorld;
scrollImage = image;

if (image != null)
{
wide = image.getWidth();
high =image.getHeight();
}
scroll(0, 0); // sets initial background image
}

public Scroller (World viewWorld, GreenfootImage image, int wide, int high)
{
this.wide = wide;
this.high = high; 
limited = true; 
world = viewWorld;
if (image != null)
{
scrollImage = new GreenfootImage(wide*world.getCellSize(), high*world.getCellSize());
 for (int x=0; x<wide*world.getCellSize(); x+= image.getWidth())
for (int y=0; y<high*world.getCellSize(); y+=image.getHeight())
scrollImage.drawImage(image, x, y);

// set initial background image
scroll(0, 0);
 }
}

public void scroll(int dsx, int dsy)
{
// adjust scroll amounts and scroll background image
if (limited)
{
    //Calcula o limite do Scroll
    int maxX = wide-world.getWidth();
    int maxY = high-world.getHeight();
    //aplica limites de distancia para o Scroll
    
if (scrolledX+dsx < 0) dsx = -scrolledX;
if (scrolledX+dsx >= maxX) dsx = maxX-scrolledX;
if (scrolledY+dsy < 0) dsy = -scrolledY;
if (scrolledY+dsy >= maxY) dsy = maxY-scrolledY; // update scroll positions

scrolledX += dsx;
scrolledY += dsy;
// scroll background image 
if (scrollImage != null)
{
world.getBackground().drawImage
(
scrollImage,
-scrolledX*world.getCellSize(),
-scrolledY*world.getCellSize()
);
  }
 }
else // unlimited image wrapping
{
//update scroll positions
scrolledX += dsx; 
scrolledY+= dsy;
// scroll background image

if (scrollImage != null)
{
// create working variables of scroll positions
int imageX = scrolledX*world.getCellSize();
int imageY = scrolledY*world.getCellSize();
// get near-zero starting positions for drawing 'scrollImage'
imageX = imageX%wide;
imageY = imageY%high;
// adjust negative values as needed
if (imageX<0) imageX += wide;
if (imageY<0) imageY += high;
GreenfootImage hold = new GreenfootImage(scrollImage); 
hold.drawImage(scrollImage, -imageX, -imageY);
if (imageX>0) hold.drawImage(scrollImage, wide-imageX, -imageY); 
if (imageY > 0) hold.drawImage(scrollImage, -imageX, high-imageY);
if (imageX > 0 && imageY>0)
hold.drawImage(scrollImage, wide-imageX, high-imageY);
world.setBackground(hold);
 }
}
for(Object obj : world.getObjects(null))
{
    Actor actor = (Actor) obj;
    actor.setLocation(actor.getX()-dsx,actor.getY()-dsy);
}
}
public int getScrolledX()
{
return scrolledX;
}

public int getScrolledY()
{
return scrolledY;
}
}
