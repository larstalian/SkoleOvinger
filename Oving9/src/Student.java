/**
 * The student class.
 */
public final class Student {
    private final String name;
    private int numberOfApprovedAssignments;

    /**
     * The student class constructor.
     *
     * @param name                        The name of the student
     * @param numberOfApprovedAssignments The number of approved assignments
     */
    public Student(String name, int numberOfApprovedAssignments) {
        this.name = name;
        this.numberOfApprovedAssignments = numberOfApprovedAssignments;
    }

    /**
     * Get-method for student name
     *
     * @return Returns this students name.
     */
    public String getName() {
        return name;
    }

    /**
     * Get-method for the number of approved assignments.
     *
     * @return Returns the number of approved assignments
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
}
