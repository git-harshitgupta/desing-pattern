package org.harshit.behavioral.template;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public abstract class OrderPrinter {

    public final void printOrder(Order order,String filename) throws FileNotFoundException {
        try(PrintWriter write = new PrintWriter(filename)) {
            write.println(start());
            write.println(formatOrderNumber(order));
            write.println(formatItems(order));
            write.println(formatTotal(order));
            write.println(end());
        }
    }

    protected abstract String start();

    protected abstract String formatOrderNumber(Order order);

    protected abstract String formatItems(Order order);

    protected abstract String formatTotal(Order order);

    protected abstract String end();

}
