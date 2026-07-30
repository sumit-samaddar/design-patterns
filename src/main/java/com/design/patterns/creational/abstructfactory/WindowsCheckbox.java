package com.design.patterns.creational.abstructfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WindowsCheckbox implements Checkbox {
    final static Logger log = LoggerFactory.getLogger(WindowsCheckbox.class);

    @Override
    public void check() {
        log.info("Windows Checkbox Checked");
    }
}
