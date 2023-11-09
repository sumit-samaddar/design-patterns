package com.design.patterns.creational.singleton;

import java.util.logging.Logger;

/**
 * @author sumit
 * Creational Design Pattern
 * Singleton pattern restricts the instantiation of a class and ensures that only one
 * instance of the class exists in the java virtual machine.
 */
public class StaticSingleton {
    private static final Logger log = Logger.getLogger(StaticSingleton.class.getName());
    private static final StaticSingleton STATIC_SINGLETON;

    // static block initialization
    // for exception handling
    static {
        try {
            log.info("Initialising StaticSingleton instance variable in static block.");
            STATIC_SINGLETON = new StaticSingleton();
        } catch (Exception e) {
            log.info("Exception occurred in creating singleton instance");
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    // private constructor to avoid client
    // applications to use constructor
    private StaticSingleton() {
    }

    public static StaticSingleton getInstance() {
        return STATIC_SINGLETON;
    }
}

class TestStaticSingleton {
    public static void main(String[] args) {
        StaticSingleton.getInstance();
    }
}