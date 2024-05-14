import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "David", 3.2),
                new Student(2, "Eric", 3.6),
                new Student(3, "Alice", 3.8),
                new Student(4, "Megan", 3.5),
                new Student(5, "Lillian", 3.0)
        };
        System.out.println("Default sort:");
        for (Student student : students) {
            System.out.println(student);
        }
        Arrays.sort(students);
        System.out.println("\nGPA sort least to greatest:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}