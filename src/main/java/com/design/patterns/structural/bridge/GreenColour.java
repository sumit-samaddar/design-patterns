package com.design.patterns.structural.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author sumit
 *
 */
public class GreenColour implements Colour {
	final static Logger log = LoggerFactory.getLogger(GreenColour.class);

	public void applyColour() {
		log.info("green.");
	}

}
