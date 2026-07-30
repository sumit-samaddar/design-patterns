package com.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Drawing implements Shape {
	final static Logger log = LoggerFactory.getLogger(Drawing.class);
	// collection of Shapes
	private List<Shape> shapes = new ArrayList<Shape>();

	public void draw(String fillColor) {
		for (Shape sh : shapes) {
			sh.draw(fillColor);
		}
	}

	// adding shape to drawing
	public void add(Shape s) {
		this.shapes.add(s);
	}

	// removing shape from drawing
	public void remove(Shape s) {
		shapes.remove(s);
	}

	// removing all the shapes
	public void clear() {
		log.info("Clearing all the shapes from drawing");
		this.shapes.clear();
	}
}
