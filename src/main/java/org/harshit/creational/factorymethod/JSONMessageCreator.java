package org.harshit.creational.factorymethod;

import org.harshit.creational.factorymethod.message.JSONMessage;
import org.harshit.creational.factorymethod.message.Message;

public class JSONMessageCreator extends MessageCreator{
    @Override
    protected Message createMessage() {
        return new JSONMessage();
    }
}
