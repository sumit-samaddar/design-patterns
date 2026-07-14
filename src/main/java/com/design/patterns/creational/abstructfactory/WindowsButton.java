package com.design.patterns.creational.abstructfactory;

import org.apache.log4j.Logger;

public class WindowsButton implements Button {
    final static Logger log = Logger.getLogger(WindowsButton.class);

    @Override
    public void click() {
        log.info("Windows Button Clicked");
    }
}
