/**
 * Side class for menu items
 * @author - samuel mckinney
 * @date - 2/10/21
 */

public class Side extends MenuItem {

    //attributes
    private boolean premiumSide;

    public Side(String name, double price, String category, boolean premiumSide) {
        super(name, price, category);
        this.premiumSide = premiumSide;
    }

    //getters and setters
    //premium side
    public boolean isPremiumSide() {
        return premiumSide;
    }
    public void setPremiumSide(boolean premiumSide) {
        this.premiumSide = premiumSide;
    }

    /**
     * Converts the object to a string.
     * @return
     */
    @Override
    public String toString() {
        if(premiumSide) {
            return "Side:   " + super.getName() + "   $" + super.getPrice() + 1 + " unless included with Entree";
        }
        else {
            return "Side:   " + super.getName() + "   $" + super.getPrice() + " unless included with Entree";
        }
    }
}
