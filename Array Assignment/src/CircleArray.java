/**
 * CircleArray.java
 * @author Samuel Mckinney
 * Course: ITEC 2150 Spring 21
 * Written 1/28/21
 * Main file for the week two coding assignment
 */

import java.util.Scanner;

public class CircleArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circle[] circleArray = new Circle[3];

        //Iterates 3 times to create 3 circle objects within an array and assigns a radius to them based on user input
        for(int i=0; i<3; i++) {
            System.out.println("Please enter the radius for circle number " + i + ".");
            circleArray[i] = new Circle(input.nextDouble());
        }
        //Iterates through the array and prints out each object's radius and area.
        for(int i=0; i<circleArray.length; i++) {
            System.out.printf("Circle " + i + "'s radius is %.2f and its area is %.2f. %n", circleArray[i].getRadius(), circleArray[i].getArea());
        }

    }
}
