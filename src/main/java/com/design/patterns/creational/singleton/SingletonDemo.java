/**
 * Singleton Pattern Demo
 *
 * Intent: Ensure a class has only one instance and provide a global point of access to it.
 *
 * This demo exercises four variations of Singleton:
 *   - StaticBlockSingleton   : created eagerly inside a static block (allows exception handling during init)
 *   - LazyInitializedSingleton: created on first call; NOT thread-safe
 *   - EagerInitializedSingleton: created at class-load time by the JVM (inherently thread-safe)
 *   - ThreadSafeSingleton    : lazy creation guarded by synchronized (safe but slower under contention)
 *
 * The identity check (==) proves both references point to the exact same object in heap memory.
 *
 * @author sumit
 */

package com.design.patterns.creational.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SingletonDemo {
    final static Logger log = LoggerFactory.getLogger(SingletonDemo.class);

    public static void main(String[] args) {

        // Static-block singleton: two calls return the same instance
        StaticBlockSingleton instance1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton instance2 = StaticBlockSingleton.getInstance();
        log.info("Are both static-block instances the same? {}", instance1 == instance2);

        // Lazy singleton: instance is created only when getInstance() is called for the first time
        LazyInitializedSingleton lazyInstance1 = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton lazyInstance2 = LazyInitializedSingleton.getInstance();
        log.info("Are both lazy instances the same? {}", lazyInstance1 == lazyInstance2);

        // Eager singleton: JVM creates the instance when the class is loaded, before any call
        EagerInitializedSingleton eagerInstance1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton eagerInstance2 = EagerInitializedSingleton.getInstance();
        log.info("Are both eager instances the same? {}", eagerInstance1 == eagerInstance2);

        // Thread-safe singleton: synchronized ensures only one thread creates the instance
        StaticBlockSingleton staticBlockInstance1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton staticBlockInstance2 = StaticBlockSingleton.getInstance();
        log.info("Are both static block instances the same? {}", staticBlockInstance1 == staticBlockInstance2);
    }

}
