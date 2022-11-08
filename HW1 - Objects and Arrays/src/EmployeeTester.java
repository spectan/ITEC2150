/**
 * EmployeeTester
 * Tests the Employee class for HW assignment 1
 *
 * @author - Samuel Mckinney
 * @date 2/2/21
 */

import java.util.Scanner;

public class EmployeeTester {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Employee[] roster = new Employee[3];

        //Loop to generate the three employee objects
        for(int i=0; i<roster.length; i++) {
            System.out.println("Please input the employee ID, hours worked, and hourly rate for new employee " + i);
            roster[i] = new Employee(input.nextInt(), input.nextInt(), input.nextDouble());
        }
        //Loop to print related info about the employee.
        for(int i=0; i<roster.length; i++) {
            System.out.println(roster[i]);
        }

    }
}
