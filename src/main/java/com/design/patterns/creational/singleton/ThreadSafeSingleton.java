package com.design.patterns.creational.singleton;

import org.apache.log4j.Logger;

/**
 * @author sumit
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    final static Logger log = Logger.getLogger(ThreadSafeSingleton.class);
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
