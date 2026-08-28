/**
 * Template Method Pattern Demo
 *
 * Intent: Define the skeleton of an algorithm in a base class, locking the order of steps,
 * while allowing subclasses to override specific steps without changing the overall structure.
 *
 * How it works here:
 *   - HouseTemplate.buildHouse() is declared final — it calls the steps in a fixed sequence:
 *       buildFoundation() → buildPillars() → buildWalls() → buildWindows()
 *   - buildFoundation() and buildWindows() have default implementations in HouseTemplate
 *     (shared by all house types).
 *   - buildPillars() and buildWalls() are abstract — each subclass provides its own version.
 *   - WoodenHouse builds wooden pillars and walls; GlassHouse builds glass variants.
 *   - The algorithm order never changes regardless of house type — only the varying steps differ.
 *
 * @author sumit
 */

package com.design.patterns.behavioral.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TemplateDemo {

    final static Logger log = LoggerFactory.getLogger(TemplateDemo.class);

    public static void main(String[] args) {
        // WoodenHouse provides its own buildPillars() and buildWalls(); rest uses HouseTemplate defaults
        HouseTemplate houseType = new WoodenHouse();
        houseType.buildHouse();

        log.info("************");

        // GlassHouse overrides the same two steps differently — sequence is identical
        houseType = new GlassHouse();
        houseType.buildHouse();
    }
}
