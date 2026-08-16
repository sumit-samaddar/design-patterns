/**
 * @author sumit
 */

package com.design.patterns.behavioral.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReceivedState implements PackageState {

    final static Logger log = LoggerFactory.getLogger(ReceivedState.class);

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
