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
public class GlassHouse extends HouseTemplate {

	final static Logger log = Logger.getLogger(GlassHouse.class.getName());

	public void buildWalls() {
		log.info("Building Glass Walls");
	}

	public void buildPillars() {
		log.info("Building Pillars with glass coating");
	}
}
