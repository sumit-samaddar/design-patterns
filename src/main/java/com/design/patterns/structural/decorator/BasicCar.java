/**
 * @author sumit
 */

package com.design.patterns.structural.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCar implements Car {
    final static Logger log = LoggerFactory.getLogger(BasicCar.class);

    public void assemble() {
        log.info("Basic Car.");
    }

}
