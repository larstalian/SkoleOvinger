import java.util.ArrayList;
import java.util.Objects;

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
  public boolean registerNewStudent(String name, int numberOfApprovedAssignments) {

    if (!studentExists(name)) {
      students.add(new Student(name, numberOfApprovedAssignments));
      numberOfStudents += 1;

      return true;
    } else {
      return false;
    }
  }

  /**
   * Method to check if a student already exists. Used by the registerStudent method.
   *
   * @param name This students name
   * @return true if the student already exists
   */
  public boolean studentExists(String name) {
    for (Student value : students) {
      if (Objects.equals(value.getName(), name)) {
        return true;
      }
    }
    return false;
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

  /**
   * Method to create a string of the 'students' array.
   *
   * @return the string
   */
  public String arrayBuilder() {
    StringBuilder s = new StringBuilder();
    for (Student student : students) {
      s.append(student);
    }
    return String.valueOf(s);
  }
}
