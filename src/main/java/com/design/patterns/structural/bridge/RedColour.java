/**
 * @author sumit
 */

package com.design.patterns.structural.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RedColour implements Colour {
	final static Logger log = LoggerFactory.getLogger(RedColour.class);

	public void applyColour() {
		log.info("red.");
	}

}
