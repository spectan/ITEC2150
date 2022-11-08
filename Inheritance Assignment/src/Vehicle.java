
/**
 * Vehicle A parent class for different types of motor vehicles
 *
 * @author cjohns25
 *
 * This class is meant for you in the in-class assignment for inheritance.
 *
 */
public class Vehicle
{
    // common attributes of motor vehicles
    private double horsepower;
    private int numberOfWheels;

    /**
     * @param horsepower
     * @param numberOfWheels
     */
    public Vehicle(double horsepower, int numberOfWheels)
    {
        this.horsepower = horsepower;
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public String toString()
    {
        return "Vehicle [horsepower=" + horsepower + ", numberOfWheels=" + numberOfWheels + "]";
    }

    /**
     * @return the horsepower
     */
    public double getHorsepower()
    {
        return horsepower;
    }

    /**
     * @param horsepower the horsepower to set
     */
    protected void setHorsepower(double horsepower)
    {
        this.horsepower = horsepower;
    }

    /**
     * @return the numberOfWheels
     */
    public int getNumberOfWheels()
    {
        return numberOfWheels;
    }

    /**
     * @param numberOfWheels the numberOfWheels to set
     */
    protected void setNumberOfWheels(int numberOfWheels)
    {
        this.numberOfWheels = numberOfWheels;
    }

}
