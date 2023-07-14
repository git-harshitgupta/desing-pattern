package org.harshit.structural.decorator;

import java.util.Base64;

public class Base64EncodedMessage implements Message{

    private Message m;

    public Base64EncodedMessage(Message m) {
        this.m = m;
    }

    @Override
    public String getContent() {
        return Base64.getEncoder().encodeToString(m.getContent().getBytes());
    }
}
