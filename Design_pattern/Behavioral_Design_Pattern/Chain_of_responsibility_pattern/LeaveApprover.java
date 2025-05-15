package Behavioral_Design_Pattern.Chain_of_responsibility_pattern;

public abstract class LeaveApprover {
    protected LeaveApprover nextApprover;
    protected String role;

    public LeaveApprover(String role) {
        this.role = role;
    }

    public void setNextApprover(LeaveApprover nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void processLeaveRequest(int days);
}

