/**
 * @author sumit
 * Defines a reusable algorithm while letting subclasses override specific steps.
 */

package com.design.patterns.behavioral.templatemethod;

/*
 * Template method defines the steps to execute an algorithm and it can provide default implementation that might be
 * common for all or some of the subclasses.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TemplateDemo {

    final static Logger log = LoggerFactory.getLogger(TemplateDemo.class);

    public static void main(String[] args) {
        HouseTemplate houseType = new WoodenHouse();
        houseType.buildHouse();
        log.info("************");
        houseType = new GlassHouse();
        houseType.buildHouse();
    }
}
