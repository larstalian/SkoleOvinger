public class Groceries {
    private String groceryName;
    private double groceryPrice; // price per kilo

    public Groceries(String groceryName, double groceryPrice) {
        this.groceryName = groceryName;
        this.groceryPrice = groceryPrice;
    }

    public String getGroceryName(String groceryName) {
        this.groceryName = groceryName;
        return groceryName;
    }

    public double getGroceryPrice() {
        return groceryPrice;
    }

    public void setGroceryPrice(double groceryPrice) { //sets the price
        this.groceryPrice = groceryPrice;
    }

    public void setGroceryDiscount(double discount) {
        groceryPrice = this.groceryPrice * discount;
    }

}
