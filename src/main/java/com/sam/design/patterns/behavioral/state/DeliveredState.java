package com.sam.design.patterns.behavioral.state;

public class DeliveredState implements PackageState {

    public void next(Package pkg) {
        pkg.setState(new ReceivedState());
    }

    public void prev(Package pkg) {
        pkg.setState(new OrderedState());
    }

    public void printStatus() {
        System.out.println("Package delivered to post office, not received yet.");
    }

    @Override
    public String toString() {
        return "DeliveredState{}";
    }

}