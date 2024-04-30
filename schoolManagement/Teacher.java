package schoolManagement;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void displayTeacherDetails() {
        System.out.println("    - " + name + " (" + subject + ")");
    }
}