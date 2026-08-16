/**
 * @author sumit
 */

package com.design.patterns.behavioral.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GlassHouse extends HouseTemplate {

	final static Logger log = LoggerFactory.getLogger(GlassHouse.class);

	public void buildWalls() {
		log.info("Building Glass Walls");
	}

	public void buildPillars() {
		log.info("Building Pillars with glass coating");
	}
}
