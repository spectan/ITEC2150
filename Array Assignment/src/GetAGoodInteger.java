import java.util.Scanner;

public class GetAGoodInteger {
	public static void main(String[] args) {
		Scanner consoleInput = new Scanner(System.in);
        
		System.out.println("Enter an integer:");
		String numberString = consoleInput.nextLine();

        while(true) {
            try {
                System.out.println("The integer is " + Integer.parseInt(numberString));
                break;
            } catch(Exception ex) {
                System.out.println("Please enter an appropriate integer:");
                numberString = consoleInput.nextLine();
            }
        }
	}
}
