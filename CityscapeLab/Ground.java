import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Ground
{
    
    private int xLeft;
    private int yTop;
    private int height;
    private int width;
    
    public Ground(int x, int y, int h, int w)
    { 
        xLeft = x;
        yTop = y;
        height = h;
        width = w;
    }

    
    public void draw (Graphics2D g2)
    {
        g2.setColor(Color.green);
        g2.drawRect(xLeft, yTop, width, height);
        g2.fillRect(xLeft, yTop, width, height);
       
    }

}
