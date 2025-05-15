package Behavioral_Design_Pattern.Iterator_design_pattern;

import java.util.List;

public class EmployeeIterator implements Iterator<Employee> {
    private List<Employee> employees;
    private int index = 0;

    public EmployeeIterator(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public boolean hasNext() {
        return index < employees.size();
    }

    @Override
    public Employee next() {
        return employees.get(index++);
    }
}
