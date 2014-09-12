

/**
 * Write a description of class Car here:
 * This activity is to teach us how to use JavaDoc to write Documentation
 * The Car class models a car with a constant fuel effiency and tracks 
 *  how much fuel is left in its tank
 * 
 * @author Tiffany Re.M 
 * @version (a version number or a date)
 */
public class Car
{
    /** the fuel efficiency of this car is measured in miles per gallon (mph) */
    private double fuelEfficiency;
    /** the fuel, measured in gallons, left in this car's tank */
    private double fuelInTank;
    

    /**
     * Constructor for Car that specifies fuel efficiency
     */
    public Car(double fuelEfficiency)
    {
    }

    /**
     * Adds the specified number of gallons of fuel to this car's tank.
     *    
     *
     * @pre        the specified number of gallons will not exceed this car's tank capacity
     * @param    gallons  the number of gallons of fuel to add to this car's tank
     * @return    description of the return value
     */
    public void addGas(double gallons)
    {
    }
    
    /**
     * Reduces the fuel in this car's tank based on this car's fuel efficiency and the 
     * specified number of miles driven.
     * 
     * @pre    the specified number of miles will not comsume more than the amount of fuel in 
     *          this car's tank
     * @param   miles the number fo miles driven
     */
    public void drive(double miles)
    {
    }

    /**
     * Returns the number of gallons of gas remaining in this car's tank.
     * @return  the number of gallons fo gas remaining in this car's tank.
     */
    public double getGasInTank()
    {
        // put your code here
        return 0;
    }


}

