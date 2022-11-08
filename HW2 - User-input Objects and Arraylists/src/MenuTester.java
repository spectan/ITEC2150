/**
 * MenuTester - generates a menu using the MenuItem parent class and those that inherit it
 * @name - samuel mckinney
 * @date - 2/10/21
 */

import java.util.Scanner;
import java.util.ArrayList;

public class MenuTester {
    /**
     * Main method.
     *
     * This creates four default menu items, allows the user to enter one additional Entree and Dessert, and generates the menu + pricing.
     *
     * @param args
     */
    public static void main(String args[]) {
        //creates the scanner object
        Scanner input = new Scanner(System.in);
        //defines an array of items on the menu
        ArrayList<MenuItem> menu = new ArrayList<MenuItem>();

        //pre-defined menu items
        Entree entreeOne = new Entree("Shellfish", 25.00, "Entree", 2);
        Appetizer appetizerOne = new Appetizer("Loaf of Honey-wheat Bread", 1.50, "Appetizer", 1);
        Side sideOne = new Side("Broccoli", 5.00, "Side", false);
        Dessert dessertOne = new Dessert("Chocolate Sundae", 3.00, "Dessert", false);

        //Creates two user-defined menu items
        //Variables used in the creation of another two objects.
        String name;
        double price;
        int numOfSides;
        boolean isFrozen;
        //Creates the new Entree
        System.out.println("Name an additional Entree.");
        name = input.nextLine();
        System.out.println("Specify the price of the Entree.");
        price = input.nextDouble();
        System.out.println("How many sides come with the Entree?");
        numOfSides = input.nextInt();
        Entree entreeTwo = new Entree(name, price, "Entree", numOfSides);
        //Creates the new Dessert
        System.out.println("Name an additional Dessert.");
        name = input.next();
        System.out.println("Specify the price of the Dessert.");
        price = input.nextDouble();
        System.out.println("Is the Dessert frozen? (true or false)");
        isFrozen = input.nextBoolean();
        Dessert dessertTwo = new Dessert(name, price, "Dessert", isFrozen);



        //adds menu-items to array list
        menu.add(entreeOne);
        menu.add(entreeTwo);
        menu.add(appetizerOne);
        menu.add(sideOne);
        menu.add(dessertOne);
        menu.add(dessertTwo);

        //iterates through array and prints all the objects on the menu
        for(int i=0; i<menu.size(); i++) {
            System.out.println(menu.get(i));
        }
    }
}
