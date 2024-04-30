package schoolManagement;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Teacher> teachers;
    private List<Student> students;

    public Department(String name) {
        this.name = name;
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayDepartmentDetails() {
        System.out.println("- " + name + " Department");
        System.out.println("  - Teachers:");
        for (Teacher teacher : teachers) {
            teacher.displayTeacherDetails();
        }
        System.out.println("  - Students:");
        for (Student student : students) {
            student.displayStudentDetails();
        }
    }
}