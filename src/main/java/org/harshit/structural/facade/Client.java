package org.harshit.structural.facade;


import org.harshit.structural.facade.email.EmailFacade;


public class Client {

	public static void main(String[] args) {
		Order order = new Order("101", 99.99);
		EmailFacade emailFacade = new EmailFacade();
		boolean result = emailFacade.sendOrderEmail(order);
		System.out.println("Order Email "+ (result?"sent!":"NOT sent..."));
	}

//	private static boolean sendOrderEmailWithoutFacade(Order order) {
//		Template template = TemplateFactory.createTemplateFor(Template.TemplateType.Email);
//		Stationary stationary = StationaryFactory.createStationary();
//		Email email = Email.getBuilder()
//					  .withTemplate(template)
//					  .withStationary(stationary)
//					  .forObject(order)
//					  .build();
//		Mailer mailer = Mailer.getMailer();
//		return mailer.send(email);
//	}
	
}
