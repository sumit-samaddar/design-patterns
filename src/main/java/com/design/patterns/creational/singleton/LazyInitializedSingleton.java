package com.design.patterns.creational.singleton;

import org.apache.log4j.Logger;

/**
 * @author sumit
 *
 */
public class LazyInitializedSingleton {
	private static LazyInitializedSingleton instance;
	final static Logger log = Logger.getLogger(LazyInitializedSingleton.class);
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
