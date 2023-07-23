package org.harshit.behavioral.strategy;

import java.util.LinkedList;

public class PrintService {
    private OrderPrinterStrategy printer;

    public PrintService(OrderPrinterStrategy printer) {
        this.printer = printer;
    }

    public void printOrders(LinkedList<Order> orders){
        printer.print(orders);
    }
}
