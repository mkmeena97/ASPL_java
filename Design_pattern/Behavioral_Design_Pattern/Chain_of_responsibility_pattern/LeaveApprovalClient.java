package Behavioral_Design_Pattern.Chain_of_responsibility_pattern;

public class LeaveApprovalClient {
    public static void main(String[] args) {
        LeaveApprover teamLead = new TeamLead();
        LeaveApprover projectManager = new ProjectManager();
        LeaveApprover hr = new HR();

        // Set up the chain
        teamLead.setNextApprover(projectManager);
        projectManager.setNextApprover(hr);

        // Test leave requests
        teamLead.processLeaveRequest(1); // Team Lead handles
        teamLead.processLeaveRequest(2); // Project Manager handles
        teamLead.processLeaveRequest(5); // HR handles
    }
}