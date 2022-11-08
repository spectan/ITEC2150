import java.util.Scanner;

public class AverageOfThreeIntegers {
    /**
     * Add a try/catch block to grab each of the three numbers. Each try catch block must be ijnside of a loop.
     * @param args
     */
	public static void main(String[] args) {
		Scanner consoleInput = new Scanner(System.in);
		
		System.out.println("Enter number 1:");
		String numberString = consoleInput.nextLine();
		int num1 = Integer.parseInt(numberString);
	
		System.out.println("Enter number 2:");
		numberString = consoleInput.nextLine();
		int num2 = Integer.parseInt(numberString);
	
		System.out.println("Enter number 3:");
		numberString = consoleInput.nextLine();
		int num3 = Integer.parseInt(numberString);


		int sum = num1 + num2 + num3;
		double average = (double) sum/3;
		
		System.out.println("The numbers are:");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		System.out.printf("The average is %.2f", average);
	}
}
