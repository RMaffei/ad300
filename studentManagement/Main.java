public class Main {
    public static void main(String[] args) {
        StudentRecordManager manager = new StudentRecordManager();
        manager.addStudentRecord(1, "Adam", 2.5);
        manager.addStudentRecord(2, "Chris", 3.2);
        manager.addStudentRecord(3, "Lisa", 2.8);
        manager.addStudentRecord(4, "Morgan", 3.0);
        manager.addStudentRecord(5, "Ana", 3.8);
        // call method of StudentRecordManager object
        manager.displayAllRecords();
        // use updateStudentGPA method to update student record
        manager.updateStudentGPA(3, 3.5);
        manager.displayAllRecords();
        // use method to delete student record
        manager.deleteStudentRecord(4);
        manager.displayAllRecords();
        // display students above 3.0 GPA
        manager.displayStudentsAboveGPA(3.0);
    }
}