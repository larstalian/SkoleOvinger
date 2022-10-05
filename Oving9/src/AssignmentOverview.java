import java.util.ArrayList;
import java.util.List;

public class AssignmentOverview {
    private List<Student> students = new ArrayList<>();
    private int numberOfStudents = 0;


    public AssignmentOverview() {
        students = new ArrayList<Student>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public void newStudent(String name, int numberOfApprovedAssignments) {
        boolean nameExists = false;
        for (int i = 0; i < getNumberOfStudents(); i++) {
            if (students.get(i).getName().equals(name)) {
                nameExists = true;
            }
        }
        if (!nameExists) {
            Student newStudent = new Student(name, numberOfApprovedAssignments);
            students.add(newStudent);

        } else {
            System.out.println("The student already exists");
        }

    }
    public String toString() {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < getNumberOfStudents(); i++) {
            text.append(students.get(i).toString()).append(" | ");
        }
        return text.toString();
    }




}
