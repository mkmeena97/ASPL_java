package Behavioral_Design_Pattern.Iterator_design_pattern;

public class IteratorDemo {
    public static void main(String[] args) {
        CompanyEmployeeDirectory directory = new CompanyEmployeeDirectory();

        // Adding employees from Audilytics Solutions
        directory.addEmployee(new Employee("Mahendra", "Backend"));
        directory.addEmployee(new Employee("Tilak", "Backend"));
        directory.addEmployee(new Employee("Rajeshwari", "Frontend"));
        directory.addEmployee(new Employee("Rituraj", "Tech Lead"));
        directory.addEmployee(new Employee("Tejas", "Management"));

        Iterator<Employee> iterator = directory.createIterator();

        System.out.println("Iterating over employees:");
        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            System.out.println("- " + emp.getName() + " (" + emp.getDepartment() + ")");
        }
    }
}
