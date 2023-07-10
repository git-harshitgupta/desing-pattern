package org.harshit.creational.factorymethod;

import org.harshit.creational.factorymethod.message.Message;

public abstract class MessageCreator {

    public Message getMessage(){
        Message msg = createMessage();
        msg.addDefaultHeaders();
        msg.encrypt();
        return msg;
    }

    protected abstract Message createMessage();

}
