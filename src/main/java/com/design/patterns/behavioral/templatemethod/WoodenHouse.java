/**
 * @author sumit
 */

package com.design.patterns.behavioral.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WoodenHouse extends HouseTemplate {
    final static Logger log = LoggerFactory.getLogger(WoodenHouse.class);

    public void buildWalls() {
        log.info("Building Wooden Walls");
    }

    public void buildPillars() {
        log.info("Building Pillars with Wood coating");
    }

}
