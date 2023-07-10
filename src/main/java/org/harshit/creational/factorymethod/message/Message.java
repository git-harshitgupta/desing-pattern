package org.harshit.creational.factorymethod.message;

public abstract class Message {

    public abstract String getContent();
    public void addDefaultHeaders(){
        System.out.println("Add default headers method");
    }

    public void encrypt(){
        System.out.println("Encrypt method");
    }

}
