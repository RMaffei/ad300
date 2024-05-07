import java.util.*;

public class StudentRecordManager {
    // treemap to store student records with iD as key and student obj as value
    private TreeMap<Integer, Student> studentRecords;
    // constructor to initialize the tree map
    public StudentRecordManager() {
        studentRecords = new TreeMap<>();
    }
    public void addStudentRecord(int id, String name, double gpa) {
        // first check if ID already exists then create w/ ID, name, GPA
        if (!studentRecords.containsKey(id)) {
            Student student = new Student(id, name, gpa);
            studentRecords.put(id, student);
            System.out.println("Student record added successfully.");
        } else {
            System.out.println("Student with ID " + id + " already exists.");
        }
    }
    public void deleteStudentRecord(int id) {
        // method to delete student record by ID
        if (studentRecords.containsKey(id)) {
            studentRecords.remove(id);
            System.out.println("Student record with ID " + id + " deleted successfully.");
        } else {
            System.out.println("Student with ID " + id + " does not exist.");
        }
    }

    public void updateStudentGPA(int id, double newGPA) {
        // update student gpa by getting student obj with matching ID, update GPA value
        if (studentRecords.containsKey(id)) {
            Student student = studentRecords.get(id);
            student.setGpa(newGPA);
            System.out.println("Student GPA updated successfully.");
        } else {
            System.out.println("Student with ID " + id + " does not exist.");
        }
    }

    public void displayAllRecords() {
        // display all student records
        System.out.println("Student Records:");
        for (Map.Entry<Integer, Student> entry : studentRecords.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue().getName() +
                    ", GPA: " + entry.getValue().getGpa());
        }
    }
    // all student records >3.0 GPA (or specified threshold)
    public void displayStudentsAboveGPA(double gpaThreshold) {
        System.out.println("Students with GPA above " + gpaThreshold + ":");
        for (Map.Entry<Integer, Student> entry : studentRecords.entrySet()) {
            if (entry.getValue().getGpa() > gpaThreshold) {
                System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue().getName() + ", GPA: " + entry.getValue().getGpa());
            }
        }
    }
}