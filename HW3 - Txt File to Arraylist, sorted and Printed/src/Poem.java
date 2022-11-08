/**
 * Poem - a subclass of Literature
 * @author - samuel mckinney
 */
public class Poem extends Literature {
    //attributes
    protected int numStanzas;

    ////////////////////////////////
    /**
     * Constructor
     * @param author
     * @param title
     * @param type
     * @param numStanzas
     */
    public Poem(String author, String title, String type, int numStanzas) {
        super(title, author, type);
        this.numStanzas = numStanzas;
    }

    ////////////////////////////////
    //Getters and Setters
    //numStanzas
    public int getNumStanzas() {
        return this.numStanzas;
    }
    public void setNumStanzas(int numStanzas) {
        this.numStanzas = numStanzas;
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
            ", numStanzas='" + getNumStanzas() + "'" +
            "}";
    }

}
