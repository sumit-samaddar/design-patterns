package com.design.patterns.structural.bridge;

import org.apache.log4j.Logger;

/**
 * @author sumit
 *
 */
public class RedColour implements Colour {
	final static Logger log = Logger.getLogger(RedColour.class);

	public void applyColour() {
		log.info("red.");
	}

}
