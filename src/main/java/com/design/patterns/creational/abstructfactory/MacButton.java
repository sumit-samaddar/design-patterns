package com.design.patterns.creational.abstructfactory;

import org.apache.log4j.Logger;

public class MacButton implements Button {
    final static Logger log = Logger.getLogger(MacButton.class);

    @Override
    public void click() {
        log.info("Mac Button Clicked");
    }
}
