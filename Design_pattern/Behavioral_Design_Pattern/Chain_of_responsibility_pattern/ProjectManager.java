package Behavioral_Design_Pattern.Chain_of_responsibility_pattern;

public class ProjectManager extends LeaveApprover {
    public ProjectManager() {
        super("Project Manager");
    }

    @Override
    public void processLeaveRequest(int days) {
        if (days <= 3) {
            System.out.println(role + " approved " + days + " day(s) leave.");
        } else if (nextApprover != null) {
            nextApprover.processLeaveRequest(days);
        }
    }
}
