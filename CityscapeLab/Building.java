import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;


/**
 *
 */
public class Building
{
    /** ideas: can you randomize the postion
       can you make sliding doors? 
       should there be a separate window class? */
    private int xLeft;
    private int yTop;
    private int windows;
    private int doubleDoors;

    /**
     */
    public Building(int x, int y)
    {
        // The coordinates 0,0 would place the Target at the top Left corner
        xLeft = x;
        yTop = y;
        windows = 12;
        doubleDoors = 1;
    }

    /**
     
     */
    public void draw(Graphics2D g2)
    {
        Rectangle frame = new Rectangle (10, 10, 0, 0);
        g2.draw(frame);
    }
    
    public void addWindows(int windows)
    {
    }
    public void addDoubleDoors(int doors)
    {
    }
    public void getWindows()
    {
    }
    public void getDoubleDoors()
    {
    }
    public void getXPosition()
    {
    }
    public void getYPosition()
    {
    }
   

}
