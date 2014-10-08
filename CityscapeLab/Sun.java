import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
/**
 * Write a description of class Sun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sun
{
    // instance variables - replace the example below with your own
    private int xLeft;
    private int yTop;
    private int majorAxis;
    private int minorAxis;

    /**
     * Constructor for objects of class Sun
     */
    public Sun(int x, int y, int w, int h)
    {
        
        xLeft = x;
        yTop = y;
        majorAxis = w;
        minorAxis = h;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.yellow);
        g2.drawOval(xLeft, yTop, majorAxis, minorAxis);
        g2.fillOval(xLeft, yTop, majorAxis, minorAxis);
    }
}
