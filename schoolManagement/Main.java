package schoolManagement;

public class Main {
    public static void main(String[] args) {
        // creating school
        School school = new School("Springfield High");

        // aggregate and populate the school with depts, teachers, and students
        Department scienceDept = new Department("Science");
        scienceDept.addTeacher(new Teacher("Mr. Smith", "Biology"));
        scienceDept.addTeacher(new Teacher("Mrs. Jones", "Chemistry"));
        scienceDept.addStudent(new Student("John Doe", "Grade 10"));
        scienceDept.addStudent(new Student("Jane Doe", "Grade 12"));
        scienceDept.addStudent(new Student("Jim Beam", "Grade 11"));
        school.addDepartment(scienceDept);

        Department mathDept = new Department("Mathematics");
        mathDept.addTeacher(new Teacher("Mr. White", "Calculus"));
        mathDept.addTeacher(new Teacher("Ms. Black", "Algebra"));
        mathDept.addStudent(new Student("Tim Cook", "Grade 10"));
        mathDept.addStudent(new Student("Ann Taylor", "Grade 11"));
        mathDept.addStudent(new Student("Gary Oak", "Grade 12"));
        school.addDepartment(mathDept);

        // display the school details (tested with assignment examples)
        school.displaySchoolDetails();
    }
}