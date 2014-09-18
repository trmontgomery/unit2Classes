

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door
{
    /** description of instance variable x (add comment for each instance variable) */
    private String state = "open";
    private String name = "Front";
    
    public Door(String name, String state)
    {
        state = "";
        name = "";
    }

    public void open()
    {
        this.state = "open";
    }
    
    public void close()
    {
        this.state = "close";
    }
    
}
