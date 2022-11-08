import java.text.DecimalFormat;

/**
 * Base MenuItem class for all items on the menu
 * @author - samuel mckinney
 * @date - 2/10/21
 */

public class MenuItem {

    //attributes for all items on the menu
    private String name;
    private double price;
    private String category;

    //DecimalFormatter for adding trailing zeroes
    //Pattern the formatter follows
    String zeroes = "###.00";
    //Creates the DecimalFormatter
    DecimalFormat accuratePrice = new DecimalFormat(zeroes);

    /**
     * Constructor
     * @param name
     * @param price
     * @param category
     */
    public MenuItem(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    //getters and setters
    //name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //price
    public String getPrice() {
        return accuratePrice.format(price);
    }
    public void setPrice(double price) {
        this.price = price;
    }
    //category
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }


}
