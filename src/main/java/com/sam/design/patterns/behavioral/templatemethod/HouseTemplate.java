package com.sam.design.patterns.behavioral.templatemethod;

import org.apache.log4j.Logger;

/**
 * @author sumit
 *
 */
public abstract class HouseTemplate {
	final static Logger log = Logger.getLogger(HouseTemplate.class);
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
