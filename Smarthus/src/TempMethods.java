/**
 * A class of temporary methods and exploring ideas.
 */
public class TempMethods {
    private final Item item;

    public TempMethods(Item item) {
        this.item = item;
    }

    /**
     * The main method.
     *
     * @param args Main method.
     */
    public static void main(String[] args) {
        Item tregulv1 = new Item("A32", "Et tregulv", 23, "MaxBo", 11.52, 15.2, 89.2, "Brun", 1, 1);
        TempMethods temp = new TempMethods(tregulv1);
        System.out.println(temp);
        System.out.println(tregulv1);
    }

    /**
     * Get category as String method.
     *
     * @param item Gets the item as parameter.
     * @return Returns the category as a string
     */
    public String toString() {
        return String.format("The category is %s", item);
    }
}