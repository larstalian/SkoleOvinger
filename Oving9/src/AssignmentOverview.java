import java.util.ArrayList;

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
  public Student findStudentWithName(String studentName) {
    for (Student student : students) {
      if (student.getName().equalsIgnoreCase(studentName)) {
        return student;
      }
    }
    return null;
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
    return findStudentWithName(name) != null;
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
