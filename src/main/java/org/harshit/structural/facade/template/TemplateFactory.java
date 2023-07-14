package org.harshit.structural.facade.template;


import org.harshit.structural.facade.email.OrderEmailTemplate;

public class TemplateFactory {

	public static Template createTemplateFor(Template.TemplateType type) {
		switch (type) {
		case Email:
			return new OrderEmailTemplate();
		default:
			throw new IllegalArgumentException("Unknown TemplateType");
		}
		
	}
}
