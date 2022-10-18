import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * The AssignmentOverview class. Contains the client, list of students and methods to register
 * students and view/edit their approved assignments
 */
public class AssignmentOverview {

  private final ArrayList<Student> students;

  private int numberOfStudents = 0;

  /** The AssignmentOverview constructor. Creates a new arraylist students. */
  public AssignmentOverview() {
    students = new ArrayList<>();
  }

  /**
   * The main method. A simple client which uses the methods in the student class and this class.
   *
   * @param args main.
   */
  public static void main(String[] args) {
    client();
  }

  /** The client method. */
  public static void client() {
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
          main.registerNewStudent(name, numberOfApprovedAssignments);
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
        case 4 -> System.out.println("\nThe registered students are: " + main);
        case 5 -> {
          System.out.println("The program exits");
          run = false;
        }
        default -> throw new IllegalStateException("Unexpected value: " + switchChoice);
      }
    }
  }

  /**
   * toString method which returns a list of Students registered.
   *
   * @return the student list
   */
  @Override
  public String toString() {
    return "AssignmentOverview{"
        + "students="
        + students
        + ", numberOfStudents="
        + numberOfStudents
        + '}';
  }

  /**
   * Get-method for this student from the students array list.
   *
   * @param studentName This students name
   * @return the student object that matches the student name input
   */
  public Student getStudentFromArray(String studentName) {
    if (findIndexOfStudent(studentName) == -1) {
      return null;
    }
    return students.get(findIndexOfStudent(studentName));
  }

  /**
   * Get-method for finding the number of students.
   *
   * @return the number of students.
   */
  public int getNumberOfStudents() {
    return numberOfStudents;
  }

  /**
   * Method for registering a new student. Uses the studentExists help method.
   *
   * @param name This students name
   * @param numberOfApprovedAssignments The number of approved assignments
   */
  public void registerNewStudent(
      String name, int numberOfApprovedAssignments) { // returnere bool. så printe i klienten
    if (studentExists(name)) {
      students.add(new Student(name, numberOfApprovedAssignments));
      numberOfStudents += 1;
      System.out.println(
          "The student "
              + name
              + " has been created. "
              + "Their current number of approved assignments are "
              + numberOfApprovedAssignments
              + ".");

    } else {
      System.out.println("Student already exists");
    }
  }

  /**
   * Method to check if a student already exists. Used by the registerStudent method.
   *
   * @param name This students name
   * @return true if the student already exists
   */
  public boolean studentExists(String name) {
    boolean b = true;
    for (Student value : students) {
      if (Objects.equals(value.getName(), name)) {
        b = false;
        break;
      }
    }
    return b;
  }

  /**
   * Method to find the student object in the student array list using the input String for name.
   * Used by the getStudentFromArray method.
   *
   * @param name The input String for name
   * @return the position of the Student object that matches the input String
   */
  public int findIndexOfStudent(String name) {
    int index = -1;
    for (int i = 0; i < getNumberOfStudents(); i++) {
      if (students.get(i).getName().equals(name)) {
        index = i;
        break;
      }
    }
    return index;
  }
}
