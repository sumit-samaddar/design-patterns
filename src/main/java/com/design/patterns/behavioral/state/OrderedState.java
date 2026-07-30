package com.design.patterns.behavioral.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderedState implements PackageState {

    final static Logger log = LoggerFactory.getLogger(OrderedState.class);

    public void next(Package pkg) {
        pkg.setState(new DeliveredState());
    }


    public void prev(Package pkg) {
        log.error("The package is in it's root state.");
    }


    public void printStatus() {
        log.info("Package ordered, not delivered to the office yet.");
    }


    public String toString() {
        return "OrderedState{}";
    }
}
