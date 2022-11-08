/**
 * Truck - Sublcass for the Vehicle class
 * @author Samuel Mckinney
 */
public class Truck extends Vehicle {
    private int numberOfDoors;
    private double cargoCapacity;

    /**
     * Constructor for the Truck
     * @param horsepower
     * @param numberOfWheels
     * @param numberOfDoors
     * @param cargoCapacity
     */
    public Truck(double horsepower, int numberOfWheels, int numberOfDoors, double cargoCapacity) {
        super(horsepower, numberOfWheels);
        this.numberOfDoors = numberOfDoors;
        this.cargoCapacity = cargoCapacity;
    }

    // Getters/Setters for numberOfDoors
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    // Getters/Setters for cargoCapacity
    public double getCargoCapacity() {
        return cargoCapacity;
    }
    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
    //To String
    @Override
    public String toString() {
        return "Truck [horsepower = " + super.getHorsepower() + ", number of wheels = " + super.getNumberOfWheels() +
                ", number of doors = " + numberOfDoors + ", cargo capacity = " + cargoCapacity + "]";

    }
}
