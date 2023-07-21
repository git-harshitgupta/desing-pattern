package org.harshit.behavioral.interpretor;

public class Client {
    public static void main(String[] args) {
        Report report1 = new Report("Cashflow report","ADMIN");
//        Report report1 = new Report("Cashflow report","NOT ADMIN");
        ExpressionBuilder expressionBuilder = new ExpressionBuilder();

        PermissionExpression exp = expressionBuilder.build(report1);
        System.out.println(exp);

        User user1 = new User("Dave","USER","ADMIN");
        System.out.println("User access report: "+exp.interpret(user1));
    }
}
