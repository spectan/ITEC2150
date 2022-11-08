/**
 * Car - Sublcass for the Vehicle class
 * @author Samuel Mckinney
 */
public class Car extends Vehicle {

    private int numberOfDoors;
    private String color;

    /**
     * Constructor for the Car
     *
     * @param horsepower
     * @param numberOfWheels
     * @param numberOfDoors
     * @param color
     */
    public Car(double horsepower, int numberOfWheels, int numberOfDoors, String color) {
        super(horsepower, numberOfWheels);
        this.numberOfDoors = numberOfDoors;
        this.color = color;
    }

    // Getters/Setters for number of doors
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    // Getters/Setters for the color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //To String
    @Override
    public String toString() {
        return "Car [horsepower = " + super.getHorsepower() + ", number of wheels = " + super.getNumberOfWheels() +
                ", number of doors = " + numberOfDoors + ", color = " + color + "]";

    }
}
