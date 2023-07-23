package org.harshit.behavioral.visitor;

public class PrintVisitor implements Visitor{
    @Override
    public void visit(Programmer programmer) {
        String msg = programmer.getName() +" is a "+programmer.getSkill()+" programmer.";
        System.out.println(msg);
    }

    @Override
    public void visit(ProjectLead lead) {
        String msg = lead.getName()+" is a project lead with "+lead.getDirectReports().size()+" programmers reporting.";
        System.out.println(msg);
    }

    @Override
    public void visit(Manager manager) {
        String msg = manager.getName()+" is a manager with "+manager.getDirectReports().size()+" lead reporting.";
        System.out.println(msg);
    }

    @Override
    public void visit(VicePresident vicePresident) {
        String msg = vicePresident.getName()+" is a vp with "+vicePresident.getDirectReports().size()+" manager reporting.";
        System.out.println(msg);
    }
}
