package com.design.patterns.creational.singleton;

/**
 * @author sumit
 * Creational Design Pattern
 * Singleton pattern restricts the instantiation of a class and ensures that only one
 * instance of the class exists in the java virtual machine.
 */
public class StaticBlockSingleton {
    private static final StaticBlockSingleton staticBlockSingleton;

    //static block initialization for exception handling
    static {
        try {
            staticBlockSingleton = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    private StaticBlockSingleton() {
    }

    public static StaticBlockSingleton getStaticBlockSingleton() {
        return staticBlockSingleton;
    }
}