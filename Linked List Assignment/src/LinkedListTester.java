import java.util.LinkedList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.ListIterator;

/**
 * LinkedListTester -- We are testing adding values to a linked list.
 * @author - Samuel Mckinney
 * @date - 4/23/2021
 */
public class LinkedListTester {

    /**
     * Reads in values from a text file and adds them to the linked list
     * @param addressBook
     * @return
     */
    public LinkedList<Address> readFile(LinkedList<Address> addressBook) {

    String fileName = "addresses.txt"; // File to be read
    File theFile = null; //Placeholder variable
    Scanner inputFile = null; //Placeholder variable

    try { // Open the file so we can start adding values to it.
        theFile = new File(fileName);
        inputFile = new Scanner(theFile);
    } catch (FileNotFoundException ex) {
        System.out.println("Specified file \"" + fileName + "\" could not be found.");
        return addressBook;
    }
    try { // Read the file and assign each read line to a value before adding it to the linked list.
        while(inputFile.hasNextLine()) {
            String name = inputFile.nextLine();
            String streetAddress = inputFile.nextLine();
            String city = inputFile.nextLine();
            addressBook.addFirst(new Address(name, streetAddress, city));
        }
    } catch(Exception ex) {
        ex.printStackTrace();
        System.out.println("There was trouble reading the file, possibly expected another type of value?");
    }finally { // Close the scanner
        inputFile.close();
    } 
        return addressBook;
    }

    /**
     * Main Method -- we simply execute the above method, print out the results, sort it, and print it out again explicitly.
     * @param args
     */
    public static void main(String[] args) {

        //Creates an instance of this class, a linked list to store the read values and reads the values
        LinkedListTester linListTester = new LinkedListTester();
        LinkedList<Address> addressBook = new LinkedList<Address>();
        addressBook = linListTester.readFile(addressBook);

        //Prints the unsorted linked list using an enhanced for loop
        System.out.println("Unsorted list:");
        for(Address a: addressBook) {
            System.out.println(a);
        }

        Collections.sort(addressBook); // Sorts the linked list
        
        ListIterator<Address> listIterator = addressBook.listIterator(); // Defines the list iterator
        //Prints the sorted list using the list iterator
        System.out.println("Sorted list:");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + "\n");
        }

    }
}
