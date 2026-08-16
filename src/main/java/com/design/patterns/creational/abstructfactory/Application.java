/**
 * @author sumit
 */

package com.design.patterns.creational.abstructfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
    final static Logger log = LoggerFactory.getLogger(Application.class);
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
