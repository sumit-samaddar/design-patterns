/**
 * @author sumit
 * Ensures only one instance of a class exists in the application.
 */

package com.design.patterns.creational.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SingletonDemo {
    final static Logger log = LoggerFactory.getLogger(SingletonDemo.class);

    public static void main(String[] args) {
        StaticBlockSingleton instance1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton instance2 = StaticBlockSingleton.getInstance();

        log.info("Are both instances the same? {}", instance1 == instance2);

        LazyInitializedSingleton lazyInstance1 = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton lazyInstance2 = LazyInitializedSingleton.getInstance();

        log.info("Are both lazy instances the same? {}", lazyInstance1 == lazyInstance2);

        EagerInitializedSingleton eagerInstance1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton eagerInstance2 = EagerInitializedSingleton.getInstance();

        log.info("Are both eager instances the same? {}", eagerInstance1 == eagerInstance2);

        StaticBlockSingleton staticBlockInstance1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton staticBlockInstance2 = StaticBlockSingleton.getInstance();

        log.info("Are both static block instances the same? {}", staticBlockInstance1 == staticBlockInstance2);
    }

}
