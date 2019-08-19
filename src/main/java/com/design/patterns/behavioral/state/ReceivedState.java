package com.design.patterns.behavioral.state;

import org.apache.log4j.Logger;

public class ReceivedState implements PackageState {

    final static Logger log = Logger.getLogger(ReceivedState.class);

    public void next(Package pkg) {
        log.info("This package is already received by a client.");
    }

    public void prev(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    public void printStatus() {
        log.info("Package was received by client.");
    }

    @Override
    public String toString() {
        return "ReceivedState{}";
    }
}
