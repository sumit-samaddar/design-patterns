package com.design.patterns.structural.bridge;

/**
 * @author sumit
 *
 */
public class BridgePattern {
	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.applyColor();

		Shape pent = new Pentagon(new GreenColor());
		pent.applyColor();
	}
}
