/**
 * @author sumit
 * Treats individual and grouped objects uniformly in a tree-like structure.
 */

package com.design.patterns.structural.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CompositeDemo {
	final static Logger log = LoggerFactory.getLogger(CompositeDemo.class);

	public static void main(String[] args) {
		Shape tri = new Triangle();
		Shape tri1 = new Triangle();
		Shape cir = new Circle();

		Drawing drawing = new Drawing();
		drawing.add(tri1);
		drawing.add(tri1);
		drawing.add(cir);

		drawing.draw("Red");

		drawing.clear();

		drawing.add(tri);
		drawing.add(cir);
		drawing.draw("Green");
		drawing.clear();
	}

}
