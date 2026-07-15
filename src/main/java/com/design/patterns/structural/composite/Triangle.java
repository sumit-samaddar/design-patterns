package com.design.patterns.structural.composite;

import org.apache.log4j.Logger;

public class Triangle implements Shape {
	final static Logger log = Logger.getLogger(Triangle.class);

	public void draw(String fillColor) {
		log.info("Drawing Triangle with color " + fillColor);
	}

}
