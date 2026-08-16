/**
 * @author sumit
 */

package com.design.patterns.structural.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pentagon extends Shape {
	final static Logger log = LoggerFactory.getLogger(Pentagon.class);

	public Pentagon(Colour c) {
		super(c);
	}

	@Override
	public void applyColor() {
		log.info("Pentagon filled with color ");
		color.applyColour();

	}

}
