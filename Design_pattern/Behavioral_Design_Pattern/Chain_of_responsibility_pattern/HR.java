package Behavioral_Design_Pattern.Chain_of_responsibility_pattern;

public class HR extends LeaveApprover {
    public HR() {
        super("HR");
    }

    @Override
    public void processLeaveRequest(int days) {
        if (days > 3) {
            System.out.println(role + " approved " + days + " day(s) leave.");
        } else {
            System.out.println("Leave request not processed.");
        }
    }
}
