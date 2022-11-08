public class ReviewOne {
    public static int countAboveTen(int[] numbers) {
        /*
        Flesh out this method so that it iterates through an array using a loop and returns how many elements in the array are above 10.
        */
        int count = 0;

        for(int i = 0; i<numbers.length; i++) {
            if(numbers[i] > 10) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] someNums = new int[]{10, 11, 4, 5, 6, 3, 9, 2, 5, 6, 19, 2, 19, 3, 6, 19, 40, 30, 3, 20, 2, 4, 7, 8, 9}; 
        System.out.println(countAboveTen(someNums));
    }
}
