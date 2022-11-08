/**
 * LiteratureTester - a class that tests inheritance using abstract classes and implementation.
 * @author - samuel mckinney
 */

import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class LiteratureTester {
    /**
     * Main Method
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) {
        //create the Arraylist to store our objects
        ArrayList<Literature> literatureItems = new ArrayList<Literature>();

        //create our two poem and prose objects; add them to the arrayList
        literatureItems.add(new Poem("Bukowski", "Bluebird", "Poem", 2));
        literatureItems.add(new Poem("Shakespeare", "Sonnet 18", "Poem", 3));
        literatureItems.add(new Prose("Tolkein", "The Return of the King", "Prose", 561));
        literatureItems.add(new Prose("Martin", "A Song of Ice and Fire Book One", "Prose", 563));

        //Sorts the arrayList
        Collections.sort(literatureItems);
        /*
        //Prints the sorted arrayList to the terminal
        for(int i=0; i<literatureItems.size(); i++) {
           System.out.println(literatureItems.get(i));
        }
        */

        //Holder variable
        File fileToWrite;
        //Object creation
        PrintWriter outputFile = null;

        try {
            String fileName = "literature.txt";
            fileToWrite = new File(fileName);
            outputFile = new PrintWriter(fileToWrite);
        } catch (IOException ex) {
            System.out.println("Unable to open the file. Check directory and name.");
        }
        try {
            for(Literature l : literatureItems) {
                outputFile.println(l.getType());
                outputFile.println(l.getAuthor());
                outputFile.println(l.getTitle());
                if(l instanceof Poem) {
                    outputFile.println(((Poem)l).getNumStanzas() + "\n");
                }
                if(l instanceof Prose) {
                    outputFile.println(((Prose)l).getNumPages() + "\n");
                }
            }
        } catch (Exception ex) {
            System.out.println("There is a problem writing to the file.");
        }
        finally {
            //Terminates printWriter on completion
            outputFile.close();
        }
    }
}
