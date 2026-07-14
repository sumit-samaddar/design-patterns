package com.design.patterns.creational.singleton;

import org.apache.log4j.Logger;

/**
 * @author sumit
 *
 */
public class EagerInitializedSingleton {
	final static Logger log = Logger.getLogger(EagerInitializedSingleton.class);
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

	// private constructor to avoid client applications to use constructor
	private EagerInitializedSingleton() {
	}

	public static EagerInitializedSingleton getInstance() {
		log.info("EagerInitializedSingleton instance created");
		return instance;
	}
}
