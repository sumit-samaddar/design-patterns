package com.design.patterns.behavioral.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author sumit
 *
 */
public abstract class HouseTemplate {
	final static Logger log = LoggerFactory.getLogger(HouseTemplate.class);
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
