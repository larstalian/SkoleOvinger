package Oppgave2;

import java.util.Scanner;

/** The client class. */
public class Client {
  /**
   * The main method.
   *
   * @param args main
   */
  public static void main(String[] args) {
    System.out.println(
        "This is a program for registering Menus and registering dishes to those Menus");

    boolean programRun = true;
    MenuRegistry run = new MenuRegistry();
    Scanner in = new Scanner(System.in);
    int choice;

    while (programRun) {
      menu();
      choice = in.nextInt();
      switch (choice) {
        case 1 -> run.registerNewDish();

        case 2 -> {
          System.out.println("Enter the name of the dish you want to find:");
          String dishName = in.next();
          System.out.println(run.findDish(dishName));
        }
        case 3 -> System.out.println(run.stringBuilderDishes(run.findDishByType()));

        case 4 -> run.registerNewMenu();

        case 5 -> System.out.println(run.stringBuilderMenus(run.findMenusTotPrice()));

        case 6 -> programRun = false;
        default -> throw new IllegalStateException("Unexpected value: " + choice);
      }
    }
  }

  private static void menu() {
    System.out.println(
        """
            \nMake a choice:
            1. Register a new dish
            2. Find a registered dish
            3  Find dishes by type
            4. Register a new menu with dishes (The dishes must already be registered)
            5. Find all menus with with a total price less than x
            6. Exit program
            """);
  }
}
