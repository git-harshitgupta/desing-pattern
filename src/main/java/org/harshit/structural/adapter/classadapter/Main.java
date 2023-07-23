package org.harshit.structural.adapter.classadapter;

public class Main {

    //this class only accepts customer objects but we are using employee objects as an adapter for customer
    public static void main(String[] args) {
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployeeData(adapter);
        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.desginCard(adapter);
        System.out.println(card);
    }

    private static void populateEmployeeData(Employee employee){
        employee.setFullName("Harshit Gupta");
        employee.setJobTitle("Software engineer");
        employee.setOfficeLocation("Pune");
    }

}
