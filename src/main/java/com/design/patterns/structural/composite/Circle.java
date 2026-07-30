package com.design.patterns.structural.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Circle implements Shape {
	final static Logger log = LoggerFactory.getLogger(Circle.class);

	public void draw(String fillColor) {
		log.info("Drawing Circle with color " + fillColor);
	}

}
