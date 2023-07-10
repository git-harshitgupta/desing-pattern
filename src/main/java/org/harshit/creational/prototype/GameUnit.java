package org.harshit.creational.prototype;

import javafx.geometry.Point3D;

import java.awt.geom.Point2D;

public abstract class GameUnit implements Cloneable{

    private Point3D position;

    public GameUnit(){
        position = Point3D.ZERO;
    }

    protected void initialize(){
        this.position = Point3D.ZERO;
        reset();
    }

    public abstract void reset();

    public GameUnit(float x, float y, float z){
        position = new Point3D(x,y,z);
    }

    public void move(Point3D direction, float distance){
        Point3D finalMove = direction.normalize();
        finalMove = finalMove.multiply(distance);
        position = position.add(finalMove);
    }

    public Point3D getPosition(){
        return position;
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException{
        try {
            GameUnit clone = (GameUnit) super.clone();
            clone.initialize();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
