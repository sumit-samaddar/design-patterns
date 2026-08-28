/**
 * Bridge Pattern Demo
 *
 * Intent: Decouple an abstraction (Shape) from its implementation (Colour) so that both
 * hierarchies can evolve independently without a combinatorial class explosion.
 *
 * How it works here:
 *   - Shape (abstraction) holds a Colour reference via composition — this is the "bridge".
 *   - Triangle and Pentagon extend Shape (abstraction hierarchy).
 *   - RedColour and GreenColour implement Colour (implementation hierarchy).
 *   - Any shape can be paired with any colour at runtime by passing the desired Colour to the constructor.
 *
 * Without Bridge: adding 3 shapes × 3 colours would require 9 concrete classes.
 * With Bridge: adding a new shape or a new colour each requires only 1 new class.
 *
 * @author sumit
 */

package com.design.patterns.structural.bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        // Triangle abstraction bridged to RedColour implementation
        Shape tri = new Triangle(new RedColour());
        tri.applyColor(); // delegates color rendering to RedColour via the bridge

        // Pentagon abstraction bridged to GreenColour implementation — no new class needed
        Shape pent = new Pentagon(new GreenColour());
        pent.applyColor();
    }
}
