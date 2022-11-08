/**
 * Dessert class for items on the menu
 * @author - samuel mckinney
 * @date - 2/10/21
 */
public class Dessert extends MenuItem {

    //attributes
    private boolean isFrozen;

    /**
     * Constructor
     * @param name
     * @param price
     * @param category
     * @param isFrozen
     */
    public Dessert(String name, double price, String category, boolean isFrozen) {
        super(name, price, category);
        this.isFrozen = isFrozen;
    }

    //getters and setters
    //isFrozen
    public boolean isFrozen() {
        return isFrozen;
    }
    public void setFrozen(boolean frozen) {
        isFrozen = frozen;
    }

    /**
     * Converts the object to a string.
     * @return
     */
    @Override
    public String toString() {
        return "Dessert:   " + super.getName() + "   $" + super.getPrice();
    }

}
