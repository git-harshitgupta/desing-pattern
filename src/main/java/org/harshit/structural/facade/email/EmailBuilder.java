package org.harshit.structural.facade.email;

import org.harshit.structural.facade.stationary.Stationary;
import org.harshit.structural.facade.template.Template;

public class EmailBuilder {

	public EmailBuilder withTemplate(Template template) {
		return this;
	}
	
	public EmailBuilder withStationary(Stationary stationary) {
		return this;
	}
	
	public EmailBuilder forObject(Object object) {
		return this;
	}
	
	public Email build() {
		return null;
	}
	
	public Email getEmail() {
		return null;
	}
}
