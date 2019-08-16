package com.sam.design.patterns.behavioral.templatemethod;

import org.apache.log4j.Logger;

/**
 * @author sumit
 */
public class WoodenHouse extends HouseTemplate {
    final static Logger log = Logger.getLogger(WoodenHouse.class);

    public void buildWalls() {
        log.info("Building Wooden Walls");
    }

    public void buildPillars() {
        log.info("Building Pillars with Wood coating");
    }

}
