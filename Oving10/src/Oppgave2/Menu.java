package Oppgave2;

import java.util.ArrayList;

/**
 * The menu record class. Contains the variables for menu objects created in the menu register.
 *
 * @param menuName The menu name
 * @param dishes The list of dishes
 */
public record Menu(String menuName, ArrayList<Dish> dishes) {}
