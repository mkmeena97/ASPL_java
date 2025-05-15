package Structural_design_pattern.Composite_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class Department implements Employee {
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void removeEmployee(Employee emp) {
        employees.remove(emp);
    }

    @Override
    public void showDetails() {
        System.out.println("\nDepartment: " + name);
        for (Employee emp : employees) {
            emp.showDetails();
        }
    }
}

