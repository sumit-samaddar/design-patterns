package com.sam.design.patterns.behavioral.state;

import org.apache.log4j.Logger;

public class DeliveredState implements PackageState {

    final static Logger log = Logger.getLogger(DeliveredState.class);

    public void next(Package pkg) {
        pkg.setState(new ReceivedState());
    }

    public void prev(Package pkg) {
        pkg.setState(new OrderedState());
    }

    public void printStatus() {
        log.info("Package delivered to post office, not received yet.");
    }

    @Override
    public String toString() {
        return "DeliveredState{}";
    }

}