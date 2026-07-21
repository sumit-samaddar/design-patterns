package com.design.patterns.structural.bridge;

/**
 * @author sumit
 *
 */
public class BridgeDemo {
	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColour());
		tri.applyColor();

		Shape pent = new Pentagon(new GreenColour());
		pent.applyColor();
	}
}
