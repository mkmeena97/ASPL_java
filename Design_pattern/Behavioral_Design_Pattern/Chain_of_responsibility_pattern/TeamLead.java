package Behavioral_Design_Pattern.Chain_of_responsibility_pattern;

public class TeamLead extends LeaveApprover {
    public TeamLead() {
        super("Team Lead");
    }

    @Override
    public void processLeaveRequest(int days) {
        if (days <= 1) {
            System.out.println(role + " approved " + days + " day(s) leave.");
        } else if (nextApprover != null) {
            nextApprover.processLeaveRequest(days);
        }
    }
}
