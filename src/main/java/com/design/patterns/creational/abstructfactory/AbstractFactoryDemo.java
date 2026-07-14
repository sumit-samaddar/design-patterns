package com.design.patterns.creational.abstructfactory;

import org.apache.log4j.Logger;

/**
 * @author sumit
 *
 */

public class AbstractFactoryDemo {
	final static Logger log = Logger.getLogger(AbstractFactoryDemo.class);

	public static void main(String[] args) {
		Application app = new Application(new WindowsFactory());
		app.render();
		app = new Application(new MacFactory());
		app.render();
	}
}
