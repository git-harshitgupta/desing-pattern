package org.harshit.behavioral.visitor;

public class Client {
    public static void main(String[] args) {
        Employee employee = buildOrganization();
        Visitor visitor = new PrintVisitor();
        visitOrgStructure(employee, visitor);


    }

    private static void visitOrgStructure(Employee employee,Visitor visitor){
        employee.accept(visitor);
        employee.getDirectReports().forEach(e->visitOrgStructure(e,visitor));
    }
    private static Employee buildOrganization(){

        Programmer p1 = new Programmer("Rachel","C++");
        Programmer p2 = new Programmer("Andy","Java");

        Programmer p3 = new Programmer("Josh","C#");
        Programmer p4 = new Programmer("Jane","C++");

        ProjectLead pl1 = new ProjectLead("Tina",p1,p2);
        ProjectLead pl2 = new ProjectLead("Joey",p3,p4);

        Manager m1 = new Manager("Chad",pl1);
        Manager m2 = new Manager("Chad II",pl2);

        VicePresident vp = new VicePresident("Richard",m1,m2);

        return vp;
    }

}
