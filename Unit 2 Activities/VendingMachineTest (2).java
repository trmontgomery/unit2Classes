

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 */
public class VendingMachineTest
{
    
    public VendingMachineTest()
    {
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test 
    public void testGetCanCount()
    {
        VendingMachine testVend = new VendingMachine(0);
        int cans = testVend.getCanCount();
        assertEquals(0, cans, 1e-6);
    }
    @Test 
    public void testGetTokenCount()
    {
        VendingMachine testVend = new VendingMachine();
        int tokens = testVend.getTokenCount();
        assertEquals(0, tokens, 1e-6);
    }
    @Test
    public void testFillUpCans()
    {
        VendingMachine testVend = new VendingMachine(0);
        testVend.fillUpCans(20);
        int cans = testVend.getCanCount();
        assertEquals(20, cans, 1e-6);
        
        testVend.fillUpCans(3);
        cans = testVend.getCanCount();
        assertEquals(23, cans, 1e-6);
    }
    @Test 
    public void testInsertTokens()
    {
        VendingMachine testVend = new VendingMachine();
        testVend.insertTokens(5);
        int tokens = testVend.getTokenCount();
        assertEquals(5, tokens, 1e-6);
        
        testVend.insertTokens(3);
        tokens = testVend.getTokenCount();
        assertEquals(8, tokens, 1e-6);
    }

}
