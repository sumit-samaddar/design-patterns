package com.design.patterns.structural.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author sumit
 *
 */
public class Triangle extends Shape {
	final static Logger log = LoggerFactory.getLogger(Triangle.class);

	public Triangle(Colour c) {
		super(c);
	}

	@Override
	public void applyColor() {
		log.info("Triangle filled with color ");
		color.applyColour();
	}

}
