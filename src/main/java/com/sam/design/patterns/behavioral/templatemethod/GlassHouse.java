package com.sam.design.patterns.behavioral.templatemethod;

import com.sam.design.patterns.behavioral.iterator.IteratorPattern;
import org.apache.log4j.Logger;

/**
 * @author sumit
 *
 */
public class GlassHouse extends HouseTemplate {

	final static Logger log = Logger.getLogger(GlassHouse.class);

	public void buildWalls() {
		log.info("Building Glass Walls");
	}

	public void buildPillars() {
		log.info("Building Pillars with glass coating");
	}
}
