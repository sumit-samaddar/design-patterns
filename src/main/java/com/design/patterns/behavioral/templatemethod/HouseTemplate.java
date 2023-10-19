package com.design.patterns.behavioral.templatemethod;


import java.util.logging.Logger;

/**
 * @author sumit
 * Behavioral Design Patterns
 * Template Method is a behavioral design pattern and it's used to create a method stub and
 * deferring some of the steps of implementation to the subclasses. Template method defines the
 * steps to execute an algorithm and it can provide default implementation that might be common
 * for all or some of the subclasses.
 */
public abstract class HouseTemplate {
	final static Logger log = Logger.getLogger(HouseTemplate.class.getName());
	// template method, final so subclasses can't override
	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		log.info("House is built.");
	}

	// default implementation
	private void buildWindows() {
		log.info("Building Glass Windows");
	}

	// methods to be implemented by subclasses
	public abstract void buildWalls();

	public abstract void buildPillars();

	private void buildFoundation() {
		log.info("Building foundation with cement,iron rods and sand");
	}
}
