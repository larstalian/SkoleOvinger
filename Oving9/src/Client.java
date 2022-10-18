import java.util.Scanner;

/** The client class. */
public class Client {

  /**
   * The main method. A simple client which uses the methods in the student class and this class.
   *
   * @param args main.
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Scanner inString = new Scanner(System.in);
    AssignmentOverview main = new AssignmentOverview();

    System.out.println(
        "This program lets you register new students " + "and track their approved assignments");

    boolean run = true;

    while (run) {
      System.out.println(
          """

                                Make a choice:
                                1. Register a new student
                                2. Find a students passed assignments
                                3. Increase a students number of passed assignments
                                4. Get list of all registered students
                                5. Exit
                                 """);

      int switchChoice = in.nextInt();
      switch (switchChoice) {
        case 1 -> {
          System.out.println(
              "\nPlease enter the new students name, "
                  + "then their current number of approved assignments");

          String name = inString.nextLine();
          int numberOfApprovedAssignments = in.nextInt();

          if (main.registerNewStudent(name, numberOfApprovedAssignments)) {
            System.out.printf(
                "The student %s has been registered. "
                    + "Their current number of approved assignments are %d.%n\n",
                name, numberOfApprovedAssignments);

          } else {
            System.out.println("The student was not registered");
          }
        }

        case 2 -> {
          System.out.println("\nEnter the students name:");
          String name = inString.nextLine();

          try {
            System.out.println(
                "\nThe student has "
                    + main.getStudentFromArray(name).getNumberOfApprovedAssignments()
                    + " approved assignments");

          } catch (Exception e) {
            System.out.println("\nThe student does not exist");
          }
        }

        case 3 -> {
          System.out.println("\nEnter the students name: ");
          String name = inString.nextLine();
          System.out.println("\nEnter the increase in number of approved assignments: ");
          int increase = in.nextInt();

          try {
            main.getStudentFromArray(name).increaseApprovedAssignments(increase);
            System.out.println(
                "\nThe student "
                    + name
                    + " now has "
                    + main.getStudentFromArray(name).getNumberOfApprovedAssignments()
                    + " approved assignments");

          } catch (Exception e) {
            System.out.println("\nThe student does not exist");
          }
        }

        case 4 -> System.out.println("\nThe registered students are: " + main.arrayBuilder());

        case 5 -> {
          System.out.println("The program exits");
          run = false;
        }

        default -> throw new IllegalStateException("Unexpected value: " + switchChoice);
      }
    }
  }
}
