import java.util.Scanner;

/** The main class. */
public class Main {
  /**
   * The main method.
   *
   * @param args main
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    PropertyRegistry run = new PropertyRegistry();
    System.out.println(
        "This is a property registry program. The program has the following functions:");
    boolean runProgram = true;

    while (runProgram) {
      menu();
      int choice = in.nextInt();
      switch (choice) {
        case 1 -> run.registerNewProperty();

        case 2 -> System.out.println(run.getProperties().toString());

        case 3 -> {
          System.out.println("Enter the municipality the property resides in");
          String municipalityName = in.next();

          System.out.println("Enter the lot number");
          String lotNumber = in.next();

          System.out.println("Enter the section number");
          String sectionNumber = in.next();

          System.out.println(run.findProperty(municipalityName, lotNumber, sectionNumber));
        }
        case 4 -> run.averageAreaOfAllProperties();

        case 5 -> System.out.println(run.allPropertiesWithLotNumberX().toString());

        case 6 -> runProgram = false;

        default -> throw new IllegalStateException("Unexpected value: " + choice);
      }
    }
  }

  /** menu method. */
  public static void menu() {
    System.out.println(
        """
                \nMake a choice:
                1. Register a new property
                2. Print all properties registered
                3. Search for properties with municipality-, lot- and section number
                4. Calculate the average area for the registered properties
                5. Find all properties with lot number x
                6. Exit program""");
  }
}
