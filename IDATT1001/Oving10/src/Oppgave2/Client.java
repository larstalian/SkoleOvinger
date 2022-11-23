package Oppgave2;

import java.util.ArrayList;
import java.util.Scanner;

/** The client class. */
public class Client {
  /**
   * The main method.
   *
   * @param args main
   */
  public static void main(String[] args) {
    MenuRegistry run = new MenuRegistry();

    // test code
    run.registerNewDish("Fish", "Main", 249);
    run.registerNewDish("Meatballs", "Main", 149);
    run.registerNewDish("Chocolate_ice_cream", "Dessert", 69);
    run.registerNewDish("Bread", "Appetizer", 80);
    // test code close

    System.out.println(
        "This is a program for registering Menus and registering dishes to those Menus");

    boolean programRun = true;
    while (programRun) {

      System.out.println(
          """
          \nMake a choice:
          1. Register a new dish
          2. Find a registered dish
          3  Find dishes by type
          4. Register a new menu with dishes (The dishes must already be registered)
          5. Find all menus with with a total price less than x
          6. Exit program""");

      Scanner in = new Scanner(System.in);
      int choice = in.nextInt();
      switch (choice) {
        case 1 -> {
          System.out.println("Enter dish name:");
          String dishName = in.next();

          if (run.dishExists(dishName)) {
            System.out.println("A dish with that name already exists.");

          } else {

            System.out.println("Enter the dish type: (Appetizer, Main, Dessert)");
            String type = in.next();

            System.out.println("Enter the dish price: ");
            int price = in.nextInt();

            if (run.registerNewDish(dishName, type, price)) {
              System.out.printf(
                  "The %s %s with the price %s,- has been registered.\n", type, dishName, price);

            } else {
              System.out.println("The dish was not registered");
            }
          }
        }

        case 2 -> {
          System.out.println("Enter the name of the dish you want to find:");
          String dishName = in.next();

          if (run.findDish(dishName) != null) {
            System.out.println(run.findDish(dishName));

          } else {
            System.out.println("Dish does not exist");
          }
        }

        case 3 -> {
          System.out.println("Enter the type: (Appetizer, Main, Dessert)");
          String dishType = in.next();

          if (run.findDishByType(dishType) != null) {
            System.out.println(run.stringBuilderDishes(run.findDishByType(dishType)));
          } else {
            System.out.println("There are no dishes of that type");
          }
        }

        case 4 -> {
          System.out.println("Enter the name of the menu you wish to create:");
          String menuName = in.next();

          if (run.menuExists(menuName)) {
            System.out.println("A menu with that name already exists");
          } else {
            ArrayList<Dish> newArrayList = new ArrayList<>();
            System.out.println("Enter the name of the dish to add the dish to the menu");

            while (true) {
              String dishNameInput = in.next();

              if (dishNameInput.equalsIgnoreCase("f")) {
                System.out.println("Finished adding dishes.");
                break;

              } else {
                if (run.findDish(dishNameInput) == null) {
                  System.out.println("A dish with that name is not registered");
                  System.out.println("Enter the name of the dish to add the dish to the menu");

                } else {
                  newArrayList.add(run.findDish(dishNameInput));
                  System.out.printf(
                      "Dish added to the menu %s. If you wish to add another dish, "
                          + "enter the new dish name. If finished adding dishes, enter 'f'%n",
                      menuName);
                }
              }
            }
            if (run.registerNewMenu(menuName, newArrayList)) {
              System.out.printf("Menu %s has been created.\nIt contains the dishes:\n", menuName);
              System.out.println((run.stringBuilderDishes(newArrayList)));

            } else {
              System.out.println("The menu was not created");
            }
          }
        }

        case 5 -> {
          System.out.println("Enter the total price: ");
          int totalPrice = in.nextInt();

          if (run.findMenusTotPrice(totalPrice) != null) {
            System.out.println(run.stringBuilderMenus(run.findMenusTotPrice(totalPrice)));

          } else {
            System.out.printf("There are no menus with a total price less than %s,-\n", totalPrice);
          }
        }

        case 6 -> {
          System.out.println("The program exists");
          programRun = false;
        }

        default -> throw new IllegalStateException("Unexpected value: " + choice);
      }
    }
  }
}
