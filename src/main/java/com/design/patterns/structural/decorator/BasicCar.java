package com.design.patterns.structural.decorator;

import org.apache.log4j.Logger;

/**
 * @author sumit
 */
public class BasicCar implements Car {
    final static Logger log = Logger.getLogger(BasicCar.class);

    public void assemble() {
        log.info("Basic Car.");
    }

}
