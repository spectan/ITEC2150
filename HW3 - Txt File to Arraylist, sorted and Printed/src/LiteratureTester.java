/**
 * LiteratureTester - revised version of ch3weekly for homework assignment 3 -- we now read in a .txt file, add it to an arraylist, sort it, and print it out to the console.
 * @author - samuel mckinney
 */

import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LiteratureTester {
    /**
     * Reads in literature.txt, converts each line to what it needs to be, creates the desired object and passes it to the arraylist.
     * @param literatureItems
     * @return
    */
    public ArrayList<Literature> readFile(ArrayList<Literature> literatureItems) {

        String fileName = "literature.txt"; // File to be read
        File theFile = null; //Placeholder variable
        Scanner inputFile = null; //Placeholder variable

        //Open the file
        try {
            theFile = new File(fileName);
            inputFile = new Scanner(theFile);
        } catch (FileNotFoundException ex) {
            System.out.println("Specified file \"" + fileName + "\" could not be found.");
            return literatureItems;
        }
        //Read the file
        try {
            while(inputFile.hasNextLine()) {
                //Read the type (poem/prose)
                String type = inputFile.nextLine();
                //Read the author's name
                String author = inputFile.nextLine();
                //Reads the name of the work
                String title = inputFile.nextLine();
                //Reads the numStanzas/numPages
                //Uses a placeholder to read as a string before converting to int
                String placeholderNum = inputFile.nextLine();
                int number = Integer.parseInt(placeholderNum);
                //Checks the type so it can assign everything to the appropriate type object
                if(type == "poem") {
                    literatureItems.add(new Poem(author, title, type, number));
                }
                else {
                    literatureItems.add(new Prose(author, title, type, number));
                }
            }
        } catch(Exception ex) {
            ex.printStackTrace();
            System.out.println("There was trouble reading the file, possibly expected another type of value?");
        }finally {
            inputFile.close(); //Close the scanner
        }
        
        return literatureItems;
    }

    /**
     * Main Method
     * @param args
     */
    public static void main(String[] args) {
        
        //Creates an instance of this class, an arraylist to store the read values and reads the values
        LiteratureTester litTester = new LiteratureTester();
        ArrayList<Literature> literatureList = new ArrayList<Literature>();
        literatureList = litTester.readFile(literatureList);

        //Sorts the arraylist
        Collections.sort(literatureList);

        //Prints the arraylist
        for(Literature l: literatureList) {
            System.out.println(l);
        }
    }
        
}
