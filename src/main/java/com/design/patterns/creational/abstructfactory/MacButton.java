package com.design.patterns.creational.abstructfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MacButton implements Button {
    final static Logger log = LoggerFactory.getLogger(MacButton.class);

    @Override
    public void click() {
        log.info("Mac Button Clicked");
    }
}
