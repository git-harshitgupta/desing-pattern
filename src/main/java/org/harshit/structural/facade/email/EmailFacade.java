package org.harshit.structural.facade.email;

import org.harshit.structural.facade.Order;
import org.harshit.structural.facade.stationary.Stationary;
import org.harshit.structural.facade.stationary.StationaryFactory;
import org.harshit.structural.facade.template.Template;
import org.harshit.structural.facade.template.TemplateFactory;

public class EmailFacade {
    public boolean sendOrderEmail(Order order){
        Template template = TemplateFactory.createTemplateFor(Template.TemplateType.Email);
        Stationary stationary = StationaryFactory.createStationary();
        Email email = Email.getBuilder()
                .withTemplate(template)
                .withStationary(stationary)
                .forObject(order)
                .build();
        Mailer mailer = Mailer.getMailer();
        return mailer.send(email);
    }
}
