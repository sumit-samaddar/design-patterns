package com.design.patterns.creational.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author sumit
 *
 */
public class EagerInitializedSingleton {
	final static Logger log = LoggerFactory.getLogger(EagerInitializedSingleton.class);
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

	// private constructor to avoid client applications to use constructor
	private EagerInitializedSingleton() {
	}

	public static EagerInitializedSingleton getInstance() {
		log.info("EagerInitializedSingleton instance created");
		return instance;
	}
}
