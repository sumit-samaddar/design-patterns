package com.design.patterns.creational.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author sumit
 *
 */
public class BuilderDemo {
	final static Logger log = LoggerFactory.getLogger(BuilderDemo.class);

	public static void main(String[] args) {
		// Using builder to get the object in a single line of code and
		// without any inconsistent state or arguments management issues
		Computer comp = new Computer.ComputerBuilder(
				"500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();

		log.info(String.valueOf(comp));
	}

}
