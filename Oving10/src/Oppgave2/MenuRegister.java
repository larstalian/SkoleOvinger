package Oppgave2;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuRegister {
  private final ArrayList<Menu> allMenus;
  private final ArrayList<Dish> allDishes;

  Scanner in = new Scanner(System.in);

  public MenuRegister() {
    allMenus = new ArrayList<>();
    allDishes = new ArrayList<>();
  }

  public void registerNewMenu() {
    System.out.println("Enter the name of the menu you wish to create:");
    String menuName = in.next();

    if (menuExists(menuName)) {
      System.out.println("A menu with that name already exists");
    } else {
      ArrayList<Dish> newArrayList = new ArrayList<>();
      String dishNameInput;
      System.out.println("Enter the name of the dish to add the dish to the menu");

      while (true) {
        dishNameInput = in.next();

        if (dishNameInput.equalsIgnoreCase("f")) {
          System.out.println("Finished adding dishes.");
          break;

        } else {
          if (findDish(dishNameInput) == null) {
            System.out.println("A dish with that name is not registered");
            System.out.println("Enter the name of the dish to add the dish to the menu");

          } else {
            newArrayList.add(findDish(dishNameInput));
            System.out.printf(
                "Dish added to the menu %s. If you wish to add another dish, "
                    + "enter the new dish name. If finished adding dishes, enter 'f'%n",
                menuName);
          }
        }
      }
      if (newArrayList.isEmpty()) {
        System.out.println("The menu was not created");

      } else {
        allMenus.add(new Menu(menuName, newArrayList));
        System.out.printf("Menu %s has been created.\nIt contains the dishes:", menuName);
        System.out.println((stringBuilderDishes(newArrayList)));
      }
    }
  }

  private boolean menuExists(String menuName) {
    boolean b = false;
    for (Menu menu : allMenus) {
      if (menu.menuName().equals(menuName)) {
        b = true;
        break;
      }
    }
    return b;
  }

  public void registerNewDish() {
    System.out.println("Enter dish name:");
    Scanner in = new Scanner(System.in);
    String dishName = in.next();

    if (dishExists(dishName)) {
      System.out.println("A dish with that name already exists.");

    } else {

      System.out.println("Enter the dish type: (Appetizer, Main, Dessert)");
      String type = in.next();
      System.out.println("Enter the dish price: ");
      int price = in.nextInt();

      allDishes.add(new Dish(dishName, type, price));
      System.out.printf(
          "The %s %s with the price %s,- has been registered.\n", type, dishName, price);
    }
  }

  public Dish findDish(String dishName) {
    for (Dish dish : allDishes) {
      if (dishName.equalsIgnoreCase(dish.dishName())) {
        return dish;
      }
    }
    return null;
  }

  public boolean dishExists(String dishName) {
    boolean b = false;
    for (Dish dish : allDishes) {
      if (dish.dishName().equals(dishName)) {
        b = true;
        break;
      }
    }
    return b;
  }

  public StringBuilder stringBuilderDishes(ArrayList<Dish> dishes) {
    StringBuilder s = new StringBuilder();
    if (dishes.isEmpty()) {
      s = new StringBuilder("\nThis list is empty");
    } else {
      for (Dish dish : dishes) {
        s.append("\nType: ")
            .append(dish.dishType())
            .append(", Dish name: ")
            .append(dish.dishName())
            .append(", Price: ")
            .append(dish.price());
      }
    }
    return s;
  }

  public StringBuilder stringBuilderMenus(ArrayList<Menu> menus) {
    StringBuilder s = new StringBuilder();
    for (Menu menu : menus) {
      s.append("\n\n\nMenu name: ")
          .append(menu.menuName())
          .append("\nContaining dishes:\n")
          .append(stringBuilderDishes(menu.dishes()));
    }
    return s;
  }

  public ArrayList<Menu> findMenusTotPrice() {
    System.out.println("Enter the total price: ");
    int totalPrice = in.nextInt();
    ArrayList<Menu> newList = new ArrayList<>();

    for (Menu menu : allMenus) {
      int tot = 0;
      for (Dish dish : menu.dishes()) {
        tot += dish.price();
        if (tot > totalPrice) {
          break;
        }
      }
      if (tot <= totalPrice) {
        newList.add(menu);
      }
    }
    return newList;
  }

  public ArrayList<Dish> findDishByType() {
    System.out.println("Enter the type: (Appetizer, Main, Dessert)");
    String dishType = in.next();
    ArrayList<Dish> newList = new ArrayList<>();

    for (Dish dish : allDishes) {

      if (dish.dishType().equalsIgnoreCase(dishType)) {
        newList.add(dish);
      }
    }
    return newList;
  }
}
