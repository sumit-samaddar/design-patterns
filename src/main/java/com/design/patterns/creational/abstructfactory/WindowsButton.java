/**
 * @author sumit
 */

package com.design.patterns.creational.abstructfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WindowsButton implements Button {
    final static Logger log = LoggerFactory.getLogger(WindowsButton.class);

    @Override
    public void click() {
        log.info("Windows Button Clicked");
    }
}
