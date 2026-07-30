package com.design.patterns.creational.abstructfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MacCheckbox implements Checkbox {
    final static Logger log = LoggerFactory.getLogger(MacCheckbox.class);

    @Override
    public void check() {
        log.info("Mac Checkbox Checked");
    }
}
