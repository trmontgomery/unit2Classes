

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
     * Constructor for Car that specifies fuel efficiency (mpg)
     */
    public Car(double fuelEfficiency)
    {
        this.fuelEfficiency = fuelEfficiency;
        /**you need to specify the object that the variable belongs to or use a different variable
         * name because the variable in the class will overshadow the gloabl variable.  
         */ 
        fuelInTank = 0;
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
        this.fuelInTank = this.fuelInTank + gallons;
    }
    

    /**
     * Reduces the fuel in this car's tank based on this car's fuel efficiency and the 
     * specified number of miles driven.
     * 
     * @pre    the specified number of miles will not comsume more than the amount of fuel in 
     *         this car's tank
     * @param  miles (the number of miles driven)
     */
    public void drive(double miles)
    {
        double gallonsBurned = miles / this.fuelEfficiency;
        this.fuelInTank = this.fuelInTank - gallonsBurned;
        
    }


    /**
     * Returns the number of gallons of gas remaining in this car's tank.
     * @return  the number of gallons fo gas remaining in this car's tank.
     */
    public double getGasInTank()
    {
        // put this to specify which object the fuelInTank method is acting on
        return this.fuelInTank;
    }


}

