/**
 * @author sumit
 */

package com.design.patterns.behavioral.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeliveredState implements PackageState {

    final static Logger log = LoggerFactory.getLogger(DeliveredState.class);

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