/**
 * @author sumit
 * Changes behavior dynamically as an object moves through different states.
 */

package com.design.patterns.behavioral.state;

public class StateDemo {

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
