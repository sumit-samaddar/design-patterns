package com.design.patterns.creational.singleton;

/**
 * @author sumit
 * Creational Design Pattern
 * Singleton pattern restricts the instantiation of a class and ensures that only one
 * instance of the class exists in the java virtual machine.
 */
public class LazyInitializedSingleton {
    private static LazyInitializedSingleton lazyInitializedSingleton;

    private LazyInitializedSingleton() {
    }

    public static LazyInitializedSingleton getLazyInitializedSingleton() {
        if (lazyInitializedSingleton == null) {
            lazyInitializedSingleton = new LazyInitializedSingleton();
        }
        return lazyInitializedSingleton;
    }
}
