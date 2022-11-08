/**
 * Prose - a subclass of Literature
 * @author - samuel mckinney
 */
public class Prose extends Literature {
    //attributes
    protected int numPages;

    ////////////////////////////////
    /**
     * Constructor
     * @param author
     * @param type
     * @param title
     * @param numPages
     */
    public Prose(String author, String title, String type, int numPages) {
        super(title, author, type);
        this.numPages = numPages;
    }

    ////////////////////////////////
    //Getters and Setters
    //number of pages
    public int getNumPages() {
        return this.numPages;
    }
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    ////////////////////////////////
    /**
     * ToString
     * @param return
     */
    @Override
    public String toString() {
        return "{" +
            " title='" + getTitle() + "'" +
            ", author='" + getAuthor() + "'" +
            ", type='" + getType() + "'" +
            ", numPages='" + getNumPages() + "'" +
            "}";
    }
    
    
}
