package Oppgave2;

/**
 * The Dish record class contains the variables for a dish object created in the menu register
 * class.
 *
 * @param dishName The dish name
 * @param dishType The dish type
 * @param price The dish price
 */
public record Dish(String dishName, String dishType, int price) {
  /**
   * A toString override method for creating a string out of the object variables.
   *
   * @return the object variables in a string
   */
  @Override
  public String toString() {
    return "\nDish type: " + dishType + "\nDish name: " + dishName + "\nPrice: " + price + ",-\n";
  }
}
