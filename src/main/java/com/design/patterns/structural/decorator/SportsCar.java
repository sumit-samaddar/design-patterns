package com.design.patterns.structural.decorator;

import org.apache.log4j.Logger;

/**
 * @author sumit
 */
public class SportsCar extends CarDecorator {
	final static Logger log = Logger.getLogger(SportsCar.class);
	public SportsCar(Car c) {
		super(c);
	}

	@Override
	public void assemble(){
		super.assemble();
		log.info(" Adding features of Sports Car.");
	}
}