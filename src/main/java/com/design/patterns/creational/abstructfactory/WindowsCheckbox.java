package com.design.patterns.creational.abstructfactory;

import org.apache.log4j.Logger;

public class WindowsCheckbox implements Checkbox {
    final static Logger log = Logger.getLogger(WindowsCheckbox.class);

    @Override
    public void check() {
        log.info("Windows Checkbox Checked");
    }
}
