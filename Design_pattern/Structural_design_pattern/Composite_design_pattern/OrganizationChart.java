package Structural_design_pattern.Composite_design_pattern;

public class OrganizationChart {
    public static void main(String[] args) {
        // Management Department Employees
        Employee hr = new IndividualEmployee("Sainath", "HR");
        Employee projectManager = new IndividualEmployee("Tejas", "Project Manager");

        // Technical Department Employees
        Employee techLead = new IndividualEmployee("Rituraj", "Technical Lead");
        Employee backendDev1 = new IndividualEmployee("Mahendra", "Backend Developer");
        Employee backendDev2 = new IndividualEmployee("Tilak", "Backend Developer");
        Employee frontendDev = new IndividualEmployee("Rajeshwari", "Frontend Developer");

        // Management Department (Composite)
        Department managementDept = new Department("Management Department");
        managementDept.addEmployee(hr);
        managementDept.addEmployee(projectManager);

        // Technical Department (Composite)
        Department technicalDept = new Department("Technical Department");
        technicalDept.addEmployee(techLead);
        technicalDept.addEmployee(backendDev1);
        technicalDept.addEmployee(backendDev2);
        technicalDept.addEmployee(frontendDev);

        // Company (Composite)
        Department company = new Department("Audilitics Solutions");
        company.addEmployee(managementDept);
        company.addEmployee(technicalDept);

        // Display the organization structure
        company.showDetails();
    }
}