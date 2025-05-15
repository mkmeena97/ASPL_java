package Behavioral_Design_Pattern.Observer_design_pattern;

// Concrete Observer 2
public class AttendanceSystem implements Observer {
    @Override
    public void update(String employeeName, String status) {
        System.out.println("Attendance System: Marking attendance for " + employeeName + " as " + status);
    }
}
