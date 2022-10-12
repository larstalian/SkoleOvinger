package Oppgave2;

public record Dish(String dishName, String dishType, int price) {

  public String toString() {
    return "\nDish type: "+ dishType+ "\nDish name: " + dishName + "\nPrice: " + price + ",-\n";
  }
}
