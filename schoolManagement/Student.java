package schoolManagement;

public class Student {
    private String name;
    private String gradeLevel;

    public Student(String name, String gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;
    }

    public void displayStudentDetails() {
        System.out.println("    - " + name + " (" + gradeLevel + ")");
    }
}