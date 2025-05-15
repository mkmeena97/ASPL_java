package Behavioral_Design_Pattern.Iterator_design_pattern;

import java.util.ArrayList;
import java.util.List;

// Concrete Collection
public class CompanyEmployeeDirectory implements EmployeeDirectory {
    private List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }

    @Override
    public Iterator<Employee> createIterator() {
        return new EmployeeIterator(employeeList);
    }
}