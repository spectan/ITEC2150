import java.util.LinkedList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.ListIterator;
import java.io.PrintWriter;
import java.io.IOException;


public class TVShowsSorter {

    /**
     * Method to read a text file and add the linesto a linked list
     * @param showList
     * @return
     */
    public LinkedList<TVShow> readFile(LinkedList<TVShow> showList) {

        String fileName = "shows.txt"; // File to be read
        File theFile = null; //Placeholder variable
        Scanner inputFile = null; //Placeholder variable
    
        try { // Open the file so we can start adding values to it.
            theFile = new File(fileName);
            inputFile = new Scanner(theFile);
        } catch (FileNotFoundException ex) {
            System.out.println("Specified file \"" + fileName + "\" could not be found.");
            return showList;
        }
        try { // Read the file and assign each read line to a value before adding it to the linked list.
            while(inputFile.hasNextLine()) {
                String showName = inputFile.nextLine();
                String streamingService = inputFile.nextLine();
                showList.addFirst(new TVShow(showName, streamingService));
            }
        } catch(Exception ex) {
            ex.printStackTrace();
            System.out.println("There was trouble reading the file, possibly expected another type of value?");
        }finally { // Close the scanner
            inputFile.close();
        } 
            return showList;
        }

    public static void main(String[] args){
        //Creates an instance of this class, a linked list to store the read values and reads the values
        TVShowsSorter showSorter = new TVShowsSorter();
        LinkedList<TVShow> showList = new LinkedList<TVShow>();
        showList = showSorter.readFile(showList);
        
        ListIterator<TVShow> listIterator = showList.listIterator(); // Defines the list iterator
        Collections.sort(showList); // Sorts the list per the CompareTo in TVShow.java

        String fileName = "sortedShows.txt"; // File to be read
        File theFile = null; //Placeholder variable
        PrintWriter writer = null; //Placeholder variable

        try { //Open the file to write
            theFile = new File(fileName);
            writer = new PrintWriter(theFile);
        } catch(IOException ex) {
            System.out.println("Unable to open \"" + fileName + "\". Check the directory and name.");
        }
        try { //Write to the file
            while(listIterator.hasNext()) { // Iterates through the list to print to the file
                writer.print(listIterator.next() + "\n");
            }
        } catch (Exception ex) {
            System.out.println("There was a problem writing to \"" + fileName + "\"");
        } finally {
            writer.close();
        }
    }
}
