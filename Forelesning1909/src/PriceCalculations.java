import java.util.InputMismatchException;
import java.util.Scanner;

public class PriceCalculations {
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner in = new Scanner(System.in);
        double groceryPrice;
        try {
            groceryPrice = in.nextDouble();
            if (groceryPrice < 0.50) throw new IllegalArgumentException();
        } catch (InputMismatchException e) {
            throw new IllegalArgumentException();
        }
        Groceries carrot = new Groceries("Carrot", groceryPrice); //Creates object carrot

        System.out.println(carrot.getGroceryPrice());
        carrot.setGroceryDiscount(0.5);
        System.out.println(carrot.getGroceryPrice());
    }
}
