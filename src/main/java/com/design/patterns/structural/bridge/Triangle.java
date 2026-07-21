package com.design.patterns.structural.bridge;

import org.apache.log4j.Logger;

/**
 * @author sumit
 *
 */
public class Triangle extends Shape {
	final static Logger log = Logger.getLogger(Triangle.class);

	public Triangle(Colour c) {
		super(c);
	}

	@Override
	public void applyColor() {
		log.info("Triangle filled with color ");
		color.applyColour();
	}

}
