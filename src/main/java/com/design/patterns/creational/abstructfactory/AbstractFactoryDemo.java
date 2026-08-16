/**
 * @author sumit
 * Creates families of related product objects without exposing concrete classes.
 */

package com.design.patterns.creational.abstructfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AbstractFactoryDemo {
	final static Logger log = LoggerFactory.getLogger(AbstractFactoryDemo.class);

	public static void main(String[] args) {
		Application app = new Application(new WindowsFactory());
		app.render();
		app = new Application(new MacFactory());
		app.render();
	}
}
