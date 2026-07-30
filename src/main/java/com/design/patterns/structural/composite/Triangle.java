package com.design.patterns.structural.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Triangle implements Shape {
	final static Logger log = LoggerFactory.getLogger(Triangle.class);

	public void draw(String fillColor) {
		log.info("Drawing Triangle with color " + fillColor);
	}

}
