


/** 
 * customer inserts token into machine
 * when token inserted can drops fron reservoir into product delivery slot
 * can be filled w/ more cans
 * goal = determine how many cans and tokens are in the machine at any given time
 */
public class VendingMachine
{
    /** description of instance variable x (add comment for each instance variable) */
    private int totalTokens = 0;
    private int totalCans = 0;
    private boolean deliverySlot = false;

    /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine()
    {
      totalCans = 10;
      totalTokens = 0;
    }
    
    public VendingMachine(int Cans)
    {
        totalCans = 0;
        totalTokens = 0;
    }

    /**
     * 
     */
    public int getCanCount()
    {
        int canAmount = totalCans;
        return canAmount;
    }
    
    /**
     * 
     */
    public int getTokenCount()
    {
        int tokenAmount = totalTokens;
        return tokenAmount;
    }
    
    /**
     * 
     */
    public void fillUpCans(int cans)
    {
        totalCans = totalCans + cans;
    }
    /**
     * assume that the method will not be called if the machine is empty
     */
    public void insertTokens(int tokens)
    {
        totalTokens = totalTokens + tokens;
        totalCans = totalCans - tokens;
        deliverySlot = true;
    }

}
