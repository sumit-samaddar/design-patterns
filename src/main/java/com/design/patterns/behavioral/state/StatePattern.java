package com.design.patterns.behavioral.state;

public class StatePattern {

    public static void main(String[] args) {

        Package pkg = new Package();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();
    }
}
