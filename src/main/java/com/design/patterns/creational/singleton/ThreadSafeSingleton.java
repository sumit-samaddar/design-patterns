package com.design.patterns.creational.singleton;

import java.util.logging.Logger;

/**
 * @author sumit
 * Creational Design Pattern
 * Singleton pattern restricts the instantiation of a class and ensures that only one
 * instance of the class exists in the java virtual machine.
 */
public class ThreadSafeSingleton {
    private static final Logger log = Logger.getLogger(ThreadSafeSingleton.class.getName());
    private static ThreadSafeSingleton instance;

    // private constructor to avoid client applications to use constructor
    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        log.info("Checking ThreadSafeSingleton instance variable is already initialised!");
        if (instance == null) {
            log.info("Initialising ThreadSafeSingleton instance variable.");
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}

class TestThreadSafeSingleton {
    public static void main(String[] args) {
        ThreadSafeSingleton.getInstance();
    }
}
