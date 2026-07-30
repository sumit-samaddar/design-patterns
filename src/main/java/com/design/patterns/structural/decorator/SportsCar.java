package com.design.patterns.structural.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author sumit
 */
public class SportsCar extends CarDecorator {
	final static Logger log = LoggerFactory.getLogger(SportsCar.class);

	public SportsCar(Car c) {
		super(c);
	}

	@Override
	public void assemble() {
		super.assemble();
		log.info(" Adding features of Sports Car.");
	}
}