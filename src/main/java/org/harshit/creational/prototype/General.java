package org.harshit.creational.prototype;

public class General extends GameUnit{

    public String state = "idle";
    public void boostMorale(){
        state="Moral boost";
    }


    @Override
    public GameUnit clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException("Generals are unique");
    }

    @Override
    public void reset() {
        throw new UnsupportedOperationException("Reset not supported");
    }
}
