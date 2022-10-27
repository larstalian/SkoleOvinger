package Oppgave2;

import java.util.ArrayList;

/**
 * The MenuRegister class contains the variables for the arraylists allMenus and AllDishes. The
 * variables are created in the constructor.
 */
public class MenuRegistry {
  private final ArrayList<Menu> allMenus;
  private final ArrayList<Dish> allDishes;

  public MenuRegistry() {
    allMenus = new ArrayList<>();
    allDishes = new ArrayList<>();
  }

  /**
   * Method for registering a new menu. The menu object is added to the allMenus arraylist.
   *
   * @param menuName the menu name
   * @param dishes the dish name
   * @return true if the menu was created
   */
  public boolean registerNewMenu(String menuName, ArrayList<Dish> dishes) {
    try {
      allMenus.add(new Menu(menuName, dishes));
      return true;

    } catch (Exception e) {
      return false;
    }
  }

  /**
   * Checks if a menu with this menus name already exists.
   *
   * @param menuName The menu name
   * @return true if the menu already exists
   */
  public boolean menuExists(String menuName) {
    return allMenus.stream().anyMatch(menu -> menu.menuName().equals(menuName));
  }

  /**
   * Method to register a new dish.
   *
   * @param dishName The dish name
   * @param type The dish type
   * @param price The dish price
   * @return true if the dish was added to the arraylist
   */
  public boolean registerNewDish(String dishName, String type, int price) {
    try {
      allDishes.add(new Dish(dishName, type, price));
      return true;

    } catch (Exception e) {
      return false;
    }
  }

  /**
   * Method to find a dish in the allDishes arraylist.
   *
   * @param dishName The dish name
   * @return the dish object with the matching dish name
   */
  public Dish findDish(String dishName) {
    for (Dish dish : allDishes) {
      if (dishName.equalsIgnoreCase(dish.dishName())) {
        return dish;
      }
    }
    return null;
  }

  /**
   * Method to check if the dish already exists.
   *
   * @param dishName The dish name
   * @return true if the dish already exists
   */
  public boolean dishExists(String dishName) {
    return allDishes.stream().anyMatch(dish -> dish.dishName().equals(dishName));
  }

  /**
   * Method to build a string out of an arraylist of type Dish.
   *
   * @param dishes The arraylist of type Dish
   * @return the string.
   */
  public StringBuilder stringBuilderDishes(ArrayList<Dish> dishes) {
    StringBuilder s = new StringBuilder();

    if (dishes.isEmpty()) {
      s = new StringBuilder("\nThis list is empty");
    } else {
      for (Dish dish : dishes) {
        s.append(dish);
      }
    }
    return s;
  }

  /**
   * Method to build a string out of an arraylist of type Menu.
   *
   * @param menus The menu arraylist
   * @return the string
   */
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

  /**
   * Method to find all menus with the total price less than x.
   *
   * @return the new arraylist of type Menu
   */
  public ArrayList<Menu> findMenusTotPrice(int totalPrice) {
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

  /**
   * Method to find all dishes by their dish type.
   *
   * @return a new arraylist of type Dish with the matching type
   */
  public ArrayList<Dish> findDishByType(String dishType) {
    ArrayList<Dish> newList = new ArrayList<>();

    for (Dish dish : allDishes) {

      if (dish.dishType().equalsIgnoreCase(dishType)) {
        newList.add(dish);
      }
    }
    return newList;
  }
}
