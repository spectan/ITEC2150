import java.util.Scanner;
public class ReviewTwo {
    public static void storyTime(String name1, String name2, int number) {
        //Fill out this method so it returns a println using three parameters
        System.out.println(name1 + " is " + number + "x better than " + name2 + ".");
    }
    public static void main(String[] args) {
        //Take a users input and ask for two strings and an integer and pass to the storytime method.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first person's name");
        String name1 = input.nextLine();
        System.out.println("Enter the second person's name");
        String name2 = input.nextLine();
        System.out.println("Enter a number");
        int number = input.nextInt();

        storyTime(name1, name2, number);

    }
}
