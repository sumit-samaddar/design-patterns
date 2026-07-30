package com.design.patterns.creational.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author sumit
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    final static Logger log = LoggerFactory.getLogger(ThreadSafeSingleton.class);
    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            log.info("ThreadSafeSingleton instance created");
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
