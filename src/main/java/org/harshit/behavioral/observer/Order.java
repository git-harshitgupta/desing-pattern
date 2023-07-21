package org.harshit.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String id;
    private double itemCost;
    private int count;
    private double discount;
    private double shippingCost;

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", itemCost=" + itemCost +
                ", count=" + count +
                ", discount=" + discount +
                ", shippingCost=" + shippingCost +
                '}';
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    private List<OrderObserver> observers = new ArrayList<>();

    public void attach(OrderObserver observer){
        observers.add(observer);
    }

    public void detach(OrderObserver observer){
        observers.remove(observer);
    }
    public Order(String id) {
        this.id = id;
    }

    public void addItem(double price){
        itemCost += price;
        count++;
        observers.forEach(observer -> observer.updated(this));
    }

    public double getItemCost() {
        return itemCost-discount+shippingCost;
    }

    public int getCount() {
        return count;
    }
}
