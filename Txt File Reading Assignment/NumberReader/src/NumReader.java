import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class NumReader {
    //Use try/catch blocks to open the provided numbers2.txt file and read it, adding each entry into an arraylist.
    //Run through the arraylist and calculate the average and print it out.

    public static void main(String[] args) throws Exception {
        ArrayList<Double> numList = new ArrayList<Double>();
        Scanner reader = null;
        
        //Opening the file
        try {
            reader = new Scanner(new File("numbers.txt"));
        } catch(FileNotFoundException ex) {
            System.out.println("Specified fil could not be found.");
        }

        try {
            while(reader.hasNextLine()) {
                String placeholderNum = reader.nextLine();
                Double number = Double.parseDouble(placeholderNum);
                numList.add(number);
            }
        } catch(Exception ex) {
            ex.printStackTrace();
            System.out.println("There was trouble reading the file.");
        } finally {
            reader.close();
        }

        //Calculate the average
        double sum = 0;
        for(Double d: numList) {
            sum += d;
        }
        double avg = (sum/numList.size());

        //Calculate the minimum and maximum
        double min = numList.get(0), max = numList.get(0);
        for(Double d: numList) {
            if(d < min) {
                min = d;
            }
            if(d > max) {
                max = d;
            }
        }

        //Printing desired outputs....
        System.out.printf("The average is: %.2f \nThe lowest number is: %.2f \nThe highest number is: %.2f\n", avg,min,max);

        System.out.println("The numbers read in are:");
        for(Double d: numList) {
            System.out.println(d);
        }
    }
}
