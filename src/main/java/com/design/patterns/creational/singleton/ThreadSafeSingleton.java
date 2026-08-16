/**
 * @author sumit
 */

package com.design.patterns.creational.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThreadSafeSingleton {
    final static Logger log = LoggerFactory.getLogger(ThreadSafeSingleton.class);
    private static ThreadSafeSingleton instance;

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
