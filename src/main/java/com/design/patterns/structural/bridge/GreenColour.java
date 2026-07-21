package com.design.patterns.structural.bridge;

import org.apache.log4j.Logger;

/**
 * @author sumit
 *
 */
public class GreenColour implements Colour {
	final static Logger log = Logger.getLogger(GreenColour.class);

	public void applyColour() {
		log.info("green.");
	}

}
