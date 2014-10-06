import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;


public class Ground
{
    
    private int xLeft;
    private int yTop;
    

    public Ground(int x, int y)
    { 
        xLeft = x;
        yTop = y;
    }

    
    public void draw (Graphics2D g2)
    {
        Rectangle ground = new Rectangle (0, 350, 800, 300);
        
        g2.draw(ground);
        g2.setColor(Color.blue);
    }

}
