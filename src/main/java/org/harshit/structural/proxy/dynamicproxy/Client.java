package org.harshit.structural.proxy.dynamicproxy;

import javafx.geometry.Point2D;

public class Client {

    public static void main(String[] args) {
        Image image = ImageFactory.getImage("A.bmp");
        image.setLocation(new Point2D(10, 10));
        image.getLocation();
        image.render();
    }

}
