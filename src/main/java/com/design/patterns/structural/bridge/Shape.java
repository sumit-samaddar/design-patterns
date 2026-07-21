package com.design.patterns.structural.bridge;

/**
 * @author sumit
 *
 */
public abstract class Shape {
	// Composition - implementor
	protected Colour color;

	// constructor with implementor as input argument
	public Shape(Colour c) {
		this.color = c;
	}

	abstract public void applyColor();
}
