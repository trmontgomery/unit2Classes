

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class CarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarTest
{
    /** description of instance variable x (add comment for each instance variable) *

    /**
     * Default constructor for objects of class CarTest
     */
    public CarTest()
    {
   
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     * Before says that you have to run this before you run anything else
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
    public void testGetGasInTank()
    {
        Car testCar = new Car(50);
        double gallons = testCar.getGasInTank();
        //assertion = make sure that the following is true
        assertEquals(0.0, gallons, 1e-6);
        //There will be a warning and it basically says that the method will not be there eventually
        //whenever you are working with doubles you need to be cautious becuase of the way that they
        //are stored in the computer; 64 bits is not enough
        //You use epsilon to tells the computer 
    }
    
    @Test
    public void testAddGas()
    {
        Car testCar = new Car(50);
        testCar.addGas(20);
        double gallons = testCar.getGasInTank();
        assertEquals(20.0, gallons, 1e-6);
        
        testCar.addGas
}
