import java.util.Scanner;

/** The main class. */
public class Main {
  /**
   * The main method.
   *
   * @param args main
   */
  public static void main(String[] args) {
    PropertyRegistry run = new PropertyRegistry();
    Main m = new Main();

    // test data
    run.registerNewProperty("Gloppen", "1445", "77", "631", "-", 1017.6, "Jens Olsen");
    run.registerNewProperty("Gloppen", "1445", "77", "131", "Syningom", 661.3, "Nicolay Madsen");
    run.registerNewProperty("Gloppen", "1445", "75", "19", "Fugletun", 650.6, "Evilyn Jensen");
    run.registerNewProperty("Gloppen", "1445", "74", "188", "-", 1457.2, "Karl Ove Bråten");
    run.registerNewProperty("Gloppen", "1445", "69", "47", "Høiberg", 1339.4, "Elsa Indregård");

    // test data close

    System.out.println(
        "This is a property registry program. The program has the following functions:");
    boolean runProgram = true;

    while (runProgram) {
      menu();
      Scanner scanner2 = new Scanner(System.in);

      int choice = scanner2.nextInt();
      switch (choice) {
        case 1 -> {
          if (run.registerNewProperty(
              m.municipalityName(),
              m.municipalityNumber(),
              m.lotNumber(),
              m.sectionNumber(),
              m.propertyName(),
              m.area(),
              m.nameOfOwner())) {

            System.out.println("The property has been registered");

          } else {
            System.out.println(
                "The property has not been registered, please check your input and try again");
          }
        }

        case 2 -> {
          System.out.println("\nList of all properties:\n");
          System.out.println(run.arrayListPrinter(run.getProperties()));
        }
        case 3 -> {
          String s1 = m.municipalityNumber();
          String s2 = m.lotNumber();
          String s3 = m.sectionNumber();
          System.out.println("\nThe property matching the search:\n");
          if (run.findProperty(s1, s2, s3) != null) {
            System.out.println(run.findProperty(s1, s2, s3));

          } else {
            System.out.println("\nThere are no properties matching the input\n");
          }
        }
        case 4 -> System.out.printf(
            "The average area of the properties registered is %s\n\n",
            run.averageAreaOfAllProperties());

        case 5 -> {
          String s = m.lotNumber();
          System.out.printf(
              "The properties with lot number %s are:\n\n%s",
              s, run.allPropertiesWithLotNumberX(s));
        }

        case 6 -> {
          if (run.deleteProperty(m.municipalityNumber(), m.lotNumber(), m.sectionNumber())) {
            System.out.println("The property was deleted");
          } else {
            System.out.println("The property was not deleted");
          }
        }

        case 7 -> System.out.printf(
            "Number of properties registered are: %s", run.getProperties().size());

        case 8 -> {
          System.out.println("The program exits...");
          runProgram = false;
        }

        default -> throw new IllegalStateException("Unexpected value: " + choice);
      }
    }
  }

  private static void menu() {
    System.out.println(
        """
                \nMake a choice:
                1. Register a new property
                2. Print all properties registered
                3. Search for properties with municipality-, lot- and section number
                4. Calculate the average area for the registered properties
                5. Find all properties with lot number x
                6. Delete a property
                7. Find number of properties registered
                8. Exit program""");
  }

  private String nameOfOwner() {
    System.out.println("Enter the full name of Owner");
    Scanner scanner9 = new Scanner(System.in);
    return scanner9.nextLine();
  }

  private double area() {
    System.out.println("Enter the property area in quadratic meters");
    Scanner scanner8 = new Scanner(System.in);
    return scanner8.nextDouble();
  }

  private String propertyName() {
    System.out.println("Enter the property name, if the property has no name, enter -");
    Scanner scanner7 = new Scanner(System.in);
    return scanner7.nextLine();
  }

  private String sectionNumber() {
    System.out.println("Enter the section number");
    Scanner scanner6 = new Scanner(System.in);
    return scanner6.nextLine();
  }

  private String lotNumber() {
    System.out.println("Enter the lot number");
    Scanner scanner11 = new Scanner(System.in);
    return scanner11.nextLine();
  }

  private String municipalityNumber() {
    System.out.println("Enter the municipality number the property resides in");
    Scanner scanner3 = new Scanner(System.in);
    return scanner3.nextLine();
  }

  private String municipalityName() {
    System.out.println("Enter the municipality name");
    Scanner scanner4 = new Scanner(System.in);
    return scanner4.nextLine();
  }
}
