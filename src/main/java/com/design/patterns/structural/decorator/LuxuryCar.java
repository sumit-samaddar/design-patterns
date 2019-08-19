package com.design.patterns.structural.decorator;

import org.apache.log4j.Logger;

/**
 * @author sumit
 */
public class LuxuryCar extends CarDecorator {
    final static Logger log = Logger.getLogger(LuxuryCar.class);

    public LuxuryCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        log.info(" Adding features of Luxury Car.");
    }
}