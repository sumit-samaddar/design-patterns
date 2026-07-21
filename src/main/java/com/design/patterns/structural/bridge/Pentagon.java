package com.design.patterns.structural.bridge;

import org.apache.log4j.Logger;

/**
 * @author sumit
 *
 */
public class Pentagon extends Shape {
	final static Logger log = Logger.getLogger(Pentagon.class);

	public Pentagon(Colour c) {
		super(c);
	}

	@Override
	public void applyColor() {
		log.info("Pentagon filled with color ");
		color.applyColour();

	}

}
