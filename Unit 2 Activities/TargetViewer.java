import javax.swing.JFrame;

public class TargetViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(400,400);
        frame.setTitle("TARGET");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TargetComponent component = new TargetComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }

}
