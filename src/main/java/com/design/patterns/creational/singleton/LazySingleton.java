package com.design.patterns.creational.singleton;

import java.util.logging.Logger;

/**
 * @author sumit
 * Creational Design Pattern
 * Singleton pattern restricts the instantiation of a class and ensures that only one
 * instance of the class exists in the java virtual machine.
 */
public class LazySingleton {
    private static final Logger log = Logger.getLogger(LazySingleton.class.getName());
    private static LazySingleton lazySingleton;

    // private constructor to avoid client applications to use constructor
    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        log.info("Checking LazySingleton instance variable is already initialised!");
        if (lazySingleton == null) {
            log.info("Initialising LazySingleton instance variable.");
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}

class TestLazySingleton {
    public static void main(String[] args) {
        LazySingleton.getInstance();
    }
}
