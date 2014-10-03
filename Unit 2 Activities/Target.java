import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * A Target that can be positioned anywhere on the screen
 * use .fill and .setColor on the objects
 */
public class Target
{
    /** */
    private int xLeft;
    private int yTop;

    /**
     * Default constructor for objects of class Target
     */
    public Target(int x, int y)
    {
        // The coordinates 0,0 would place the Target at the top Left corner
        xLeft = x;
        yTop = y;
    }

    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double circle1 = new Ellipse2D.Double(xLeft + 150, yTop + 150, 100, 100);
        Ellipse2D.Double circle2 = new Ellipse2D.Double(xLeft + 20, yTop + 20, 100, 100);
        Ellipse2D.Double circle3 = new Ellipse2D.Double(xLeft + 30, yTop + 30, 100, 100);
        g2.draw(circle1);
        g2.draw(circle2);
        g2.draw(circle3);
    }
    
}
