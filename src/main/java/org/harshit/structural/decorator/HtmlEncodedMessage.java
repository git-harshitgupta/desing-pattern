package org.harshit.structural.decorator;

import org.apache.commons.text.StringEscapeUtils;

public class HtmlEncodedMessage implements Message{
    private final Message msg;

    public HtmlEncodedMessage(Message msg){
        this.msg=msg;
    }
    @Override
    public String getContent() {
        return StringEscapeUtils.escapeHtml4(msg.getContent());
    }
}
