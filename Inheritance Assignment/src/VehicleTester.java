/**
 * VehicleTester 2
 * Tester/main method for inheritance chapter 3 assignment
 * @author Samuel Mckinney
 */

import java.util.Scanner;
import java.util.ArrayList;

public class VehicleTester {
    /**
     * Main method. We ask the user to create several objects, store them in an array list, and print them.
     * @param args
     */
    public static void main(String args[]) {
        Car testCar = new Car (450, 4, 4, "Black");
        Truck testTruck = new Truck(750,18,2,950);

        //Creates the Scanner object
        Scanner input = new Scanner(System.in);

        //Defines an arraylist that will store our created car and truck objects
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

        //sets up variables used in the creation of our objects
        int horsepower, numberOfWheels, numberOfDoors, cargoCapacity;
        String name, color;

        //This could probably be done much more efficiently with loops.
        //Creates two car objects
        for(int i=1; i<3; i++) {
            System.out.println("Please enter the horsepower");
            horsepower = input.nextInt();
            System.out.println("Please enter the number of wheels");
            numberOfWheels = input.nextInt();
            System.out.println("Please enter the number of doors");
            numberOfDoors = input.nextInt();
            System.out.println("Please enter the color of the car");
            color = input.next();
            if (i==1) {
                Car carOne = new Car(horsepower, numberOfWheels, numberOfDoors, color);
                vehicles.add(carOne);
            }
            if (i==2) {
                Car carTwo = new Car(horsepower, numberOfWheels, numberOfDoors, color);
                vehicles.add(carTwo);}

        }
        //Creates two truck objects
        for(int i=1; i<3; i++) {
            System.out.println("Please enter the horsepower");
            horsepower = input.nextInt();
            System.out.println("Please enter the number of wheels");
            numberOfWheels = input.nextInt();
            System.out.println("Please enter the number of doors");
            numberOfDoors = input.nextInt();
            System.out.println("Please enter the cargo capacity of the truck");
            cargoCapacity = input.nextInt();
            if (i==1) {
                Truck truckOne = new Truck(horsepower, numberOfWheels, numberOfDoors, cargoCapacity);
                vehicles.add(truckOne);
            }
            if (i==2) {
                Truck truckTwo = new Truck(horsepower, numberOfWheels, numberOfDoors, cargoCapacity);
                vehicles.add(truckTwo);}

        }
        //Prints outputs
        for(int i=0; i<vehicles.size(); i++) {
            System.out.println(vehicles.get(i));
        }
    }
}
