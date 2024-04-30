package schoolManagement;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Department> departments;

    public School(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displaySchoolDetails() {
        System.out.println("School: " + name);
        System.out.println("Departments:");
        for (Department department : departments) {
            department.displayDepartmentDetails();
        }
    }
}