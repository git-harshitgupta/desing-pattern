package org.harshit.behavioral.strategy;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;


public class SummaryPrinter implements OrderPrinterStrategy{
    @Override
    public void print(Collection<Order> orders) {
        System.out.println("***Summary Report***");
        AtomicInteger count = new AtomicInteger(1);
        orders.forEach(order -> {
            System.out.println((count+". "+order.getId()+"\t"+order.getDate()+"\t"+order.getItems().size()+"\t"+ order.getTotal()));
            count.getAndIncrement();
        });
        System.out.println("*****");
    }
}
