/**
 * @author sumit
 */

package com.design.patterns.creational.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LazyInitializedSingleton {
    final static Logger log = LoggerFactory.getLogger(LazyInitializedSingleton.class);
    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {
    }

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            log.info("LazyInitializedSingleton instance created");
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
