package com.design.patterns.creational.singleton;

import java.util.logging.Logger;

/**
 * @author sumit
 * Creational Design Pattern
 * Singleton pattern restricts the instantiation of a class and ensures that only one
 * instance of the class exists in the java virtual machine.
 */
public class EagerSingleton {
    private static final Logger log = Logger.getLogger(EagerSingleton.class.getName());
    private static final EagerSingleton EAGER_SINGLETON = new EagerSingleton();

    // private constructor to avoid client applications to use constructor
    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        log.info("Getting EagerSingleton object. Object being initialised during class creation.");
        return EAGER_SINGLETON;
    }
}

class TestEagerSingleton {
    public static void main(String[] args) {
        EagerSingleton.getInstance();
    }
}
