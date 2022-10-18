/**
 * The student class. Used by the AssignmentOverview class to create a student object. The student
 * name is immutable. The number of approved assignments can be increased by the
 * increaseApprovedAssignments method.
 */
public final class Student {
  private final String name;
  private int numberOfApprovedAssignments;

  /**
   * The student class constructor.
   *
   * @param name The name of the student
   * @param numberOfApprovedAssignments The number of approved assignments
   */
  public Student(String name, int numberOfApprovedAssignments) {
    this.name = name;
    this.numberOfApprovedAssignments = numberOfApprovedAssignments;
  }

  /**
   * Get-method for this students name.
   *
   * @return Returns students name.
   */
  public String getName() {
    return name;
  }

  /**
   * Get-method for the number of approved assignments.
   *
   * @return the number of approved assignments
   */
  public int getNumberOfApprovedAssignments() {
    return numberOfApprovedAssignments;
  }

  /**
   * Method for increasing the number of approved assignments for this student.
   *
   * @param increase The increase of approved assignments
   */
  public void increaseApprovedAssignments(int increase) {
    this.numberOfApprovedAssignments += increase;
  }

  @Override
  public String toString() {
    return "\n\nStudent name: "
        + name
        + "\nNumber of approved assignments:"
        + numberOfApprovedAssignments;
  }
}
