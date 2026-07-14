package com.design.patterns.creational.abstructfactory;

import org.apache.log4j.Logger;

public class MacCheckbox implements Checkbox {
    final static Logger log = Logger.getLogger(MacCheckbox.class);

    @Override
    public void check() {
        log.info("Mac Checkbox Checked");
    }
}
