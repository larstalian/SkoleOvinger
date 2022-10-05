public class Student {
    public Student(String name, int numberOfApprovedAssignments){
        this.name = name;
        this.numberOfApprovedAssignments = numberOfApprovedAssignments;
    }
    private final String name;
    private int numberOfApprovedAssignments;

    public String getName() {
        return name;
    }

    public int getNumberOfApprovedAssignments() {
        return numberOfApprovedAssignments;
    }

    public void increaseNumberOfApprovedAssignments(int numberOfApprovedAssignments) {
        this.numberOfApprovedAssignments = numberOfApprovedAssignments + 1;
    }

    public String toString() {
        return "ee";
    }
}
