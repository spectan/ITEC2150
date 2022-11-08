/**
 * Appetizer class for menu items
 * @author - samuel mckinney
 * @date - 2/10/21
 */
public class Appetizer extends MenuItem {

    //attributes
    private int numOfIndividualItems;

    /**
     * Constructor
     * @param name
     * @param price
     * @param category
     * @param numOfIndividualItems
     */
    public Appetizer(String name, double price, String category, int numOfIndividualItems) {
        super(name, price, category);
        this.numOfIndividualItems = numOfIndividualItems;
    }

    //getters and setters
    //numOfIndividualItems
    public int getNumOfIndividualItems() {
        return numOfIndividualItems;
    }
    public void setNumOfIndividualItems(int numOfIndividualItems) {
        this.numOfIndividualItems = numOfIndividualItems;
    }

    /**
     * Converts the object to a string.
     * @return
     */
    @Override
    public String toString() {
        return "Appetizer:   " + super.getName() + " x" + numOfIndividualItems + "   $" + super.getPrice();
    }

}
