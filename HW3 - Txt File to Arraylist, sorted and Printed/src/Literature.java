/**
 * Literature - A primary class for literary works
 * @author - samuel mckinney
 */

public abstract class Literature implements Comparable<Literature> {
    //attributes
    protected String title, author, type;

    ////////////////////////////////
    /**
     * Constructor
     * @param title
     * @param author
     * @param type
     */
    public Literature(String title, String author, String type) {
        this.title = title;
        this.author = author;
        this.type = type;
    }

    ////////////////////////////////
    //Getters and Setters
    //title
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    //author
    public String getAuthor() {
        return this.author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    //type
    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }

    ////////////////////////////////
    /**
     * CompareTo Method
     * @param other
     * @return
     */
    @Override
    public int compareTo(Literature other) {
        if (author.equals(other.author)) {
            return title.compareTo(other.title);
        }
        else {
            return author.compareTo(other.author);
        }
    }

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
            "}";
    }


    
}
