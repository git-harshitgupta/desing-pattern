package org.harshit.behavioral.mediator;

public interface UIControl {

    void controlChanged(UIControl control);
    String getControlValue();
    String getControlName();

}
