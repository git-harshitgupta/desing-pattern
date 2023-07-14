package org.harshit.structural.adapter.objectadapter;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeClassAdapter adapter = new EmployeeClassAdapter(employee);
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
