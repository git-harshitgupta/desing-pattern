package org.harshit.behavioral.chainofresponsibility;

public class ProjectLead extends Employee{

    public ProjectLead(LeaveApprover successor){
        super("Project Lead",successor);
    }
    //type is sick leave and duration is less than or equal to 2 days
    @Override
    protected boolean processRequest(LeaveApplication application) {
        if (application.getType() == LeaveApplication.Type.Sick&& application.getNoOfDays()<=2){
            application.approve(getApproverRole());
            return true;
        }
        return false;
    }
}
