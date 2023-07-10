package org.harshit.creational.factorymethod;

import org.harshit.creational.factorymethod.message.Message;
import org.harshit.creational.factorymethod.message.TextMessage;

public class TextMessageCreator extends MessageCreator{
    @Override
    protected Message createMessage() {
        return new TextMessage();
    }
}
