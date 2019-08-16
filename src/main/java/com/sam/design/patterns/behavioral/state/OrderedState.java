package com.sam.design.patterns.behavioral.state;

public class OrderedState implements PackageState {

    public void next(Package pkg) {
        pkg.setState(new DeliveredState());
    }


    public void prev(Package pkg) {
        System.out.println("The package is in it's root state.");
    }


    public void printStatus() {
        System.out.println("Package ordered, not delivered to the office yet.");
    }


    public String toString() {
        return "OrderedState{}";
    }
}
