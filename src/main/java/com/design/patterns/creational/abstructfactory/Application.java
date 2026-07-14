package com.design.patterns.creational.abstructfactory;

import org.apache.log4j.Logger;

public class Application {
    final static Logger log = Logger.getLogger(Application.class);
	private Button button;
	private Checkbox checkbox;

	public Application(UIFactory factory) {
		button = factory.createButton();
		checkbox = factory.createCheckbox();
	}

	public void render() {
		button.click();
		checkbox.check();
	}
}
