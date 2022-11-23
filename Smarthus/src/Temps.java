/**
 * A class of temporary methods and exploring ideas.
 */
public class Temps {
    private final Item item;

    public Temps(Item item) {
        this.item = item;
    }

    /**
     * The main method.
     *
     * @param args Main method.
     */
    public static void main(String[] args) {
        Item tregulv1 = new Item("A32", "Et tregulv", 23, "MaxBo", 11.52, 15.2, 89.2, "Brun", 1, 1);
        Temps temps = new Temps(tregulv1);
        System.out.println(temps);
        System.out.println(tregulv1);
    }

    /**
     * Get category as String method.
     *
     * @return Returns the category as a string
     */
    public String toString() {
        return String.format("The category is %s", item);
    }
}
