package org.harshit.structural.proxy.dynamicproxy;


import javafx.geometry.Point2D;

public class BitmapImage implements Image {

    private Point2D location;
    private String name;

    public BitmapImage(String name) {
        System.out.println("Loaded from disk:"+name);
        this.name = name;
    }

    @Override
    public void setLocation(Point2D point2D) {
        location = point2D;
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void render() {
        System.out.println("Rendered "+name);
    }
}
