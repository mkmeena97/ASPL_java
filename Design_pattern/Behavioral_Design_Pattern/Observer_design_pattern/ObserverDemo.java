package Behavioral_Design_Pattern.Observer_design_pattern;

import java.util.ArrayList;
import java.util.List;

// Client
public class ObserverDemo {
    public static void main(String[] args) {
        EmployeeStatus employeeStatus = new EmployeeStatus("Mahendra");

        PayrollSystem payrollSystem = new PayrollSystem();
        AttendanceSystem attendanceSystem = new AttendanceSystem();

        employeeStatus.registerObserver(payrollSystem);
        employeeStatus.registerObserver(attendanceSystem);

        employeeStatus.setStatus("Present");
        employeeStatus.setStatus("On Leave");

        employeeStatus.removeObserver(attendanceSystem);

        employeeStatus.setStatus("Working from Home");
    }
}

