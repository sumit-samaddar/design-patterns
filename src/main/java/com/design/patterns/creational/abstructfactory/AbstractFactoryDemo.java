package com.design.patterns.creational.abstructfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author sumit
 *
 */

public class AbstractFactoryDemo {
	final static Logger log = LoggerFactory.getLogger(AbstractFactoryDemo.class);

	public static void main(String[] args) {
		Application app = new Application(new WindowsFactory());
		app.render();
		app = new Application(new MacFactory());
		app.render();
	}
}
