/**
 * Entree Class for items on the menu
 * @author - samuel mckinney
 * @date 2/10/21
 */

public class Entree extends MenuItem {

    //attributes
    private int numOfSides;

    /**
     * Constructor
     * @param name
     * @param price
     * @param category
     * @param numOfSides
     */
    public Entree(String name, double price, String category, int numOfSides) {
        super(name, price, category);
        this.numOfSides = numOfSides;
    }

    //getters and setters
    //number of sides
    public int getNumOfSides() {
        return numOfSides;
    }
    public void setNumOfSides(int numOfSides) {
        this.numOfSides = numOfSides;
    }

    /**
     * Converts the object to a string.
     * @return
     */
    @Override
    public String toString() {
        return "Entree:   " + super.getName() + " with " + numOfSides + " sides.   $" + super.getPrice();
    }
}
