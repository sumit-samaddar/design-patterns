/**
 * @author sumit
 */

package com.design.patterns.creational.singleton;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StaticBlockSingleton {
    final static Logger log = LoggerFactory.getLogger(StaticBlockSingleton.class);
    private static final StaticBlockSingleton instance;

    //static block initialization for exception handling
    static {
        try {
            log.info("StaticBlockSingleton instance created");
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            log.error("Exception occurred in creating singleton instance due to {}", ExceptionUtils.getStackTrace(e));
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    private StaticBlockSingleton() {
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}