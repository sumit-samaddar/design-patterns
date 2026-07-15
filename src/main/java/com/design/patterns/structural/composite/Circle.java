package com.design.patterns.structural.composite;

import org.apache.log4j.Logger;

public class Circle implements Shape {
	final static Logger log = Logger.getLogger(Circle.class);

	public void draw(String fillColor) {
		log.info("Drawing Circle with color " + fillColor);
	}

}
