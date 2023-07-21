package org.harshit.behavioral.chainofresponsibility;

public interface LeaveApprover {
    void processLeaveApplication(LeaveApplication application);
    String getApproverRole();
}
