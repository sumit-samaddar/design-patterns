package com.sam.design.patterns.structural.bridge;


/**
 * @author sumit
 *
 */
public class Triangle extends Shape {

	public Triangle(Color c) {
		super(c);
	}
	
	@Override
	public void applyColor() {
		System.out.print("Triangle filled with color ");
		color.applyColor();
	}

}
