package org.harshit.behavioral.template;

import java.io.FileNotFoundException;

public class Client {
    public static void main(String[] args) throws FileNotFoundException {
        Order order =  new Order("1");
        order.addItem("Soda",10);
        order.addItem("Sandwich",50);
        order.addItem("Pizza",250);

        OrderPrinter printer = new TextPrinter();
        printer.printOrder(order,"1.txt");

        printer = new HtmlPrinter();
        printer.printOrder(order,"1.html");
    }
}
