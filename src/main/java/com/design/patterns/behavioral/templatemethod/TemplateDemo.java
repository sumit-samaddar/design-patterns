package com.design.patterns.behavioral.templatemethod;

/*
 * Template method defines the steps to execute an algorithm and it can provide default implementation that might be 
 * common for all or some of the subclasses.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author sumit
 *
 */
public class TemplatePattern {

	final static Logger log = LoggerFactory.getLogger(TemplatePattern.class);

	public static void main(String[] args) {

		HouseTemplate houseType = new WoodenHouse();

		// using template method
		houseType.buildHouse();
		log.info("************");

		houseType = new GlassHouse();

		houseType.buildHouse();
	}
}
