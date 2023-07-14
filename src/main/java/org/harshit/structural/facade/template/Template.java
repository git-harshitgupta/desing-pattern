package org.harshit.structural.facade.template;

public abstract class Template {

	public enum TemplateType {Email, NewsLetter};
	
	public abstract String format(Object obj);
	
}
