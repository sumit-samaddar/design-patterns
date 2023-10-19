package com.design.patterns.creational.singleton;

/**
 * @author sumit
 * Creational Design Pattern
 * Singleton pattern restricts the instantiation of a class and ensures that only one
 * instance of the class exists in the java virtual machine.
 */
public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton eagerInitializedSingleton = new EagerInitializedSingleton();

    // private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getEagerInitializedSingleton() {
        return eagerInitializedSingleton;
    }
}
