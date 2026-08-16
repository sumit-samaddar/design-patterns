/**
 * @author sumit
 * Separates an abstraction from its implementation so both can vary independently.
 */

package com.design.patterns.structural.bridge;

public class BridgeDemo {
	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColour());
		tri.applyColor();

		Shape pent = new Pentagon(new GreenColour());
		pent.applyColor();
	}
}
