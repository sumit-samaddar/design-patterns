/**
 * Decorator Pattern Demo
 *
 * Intent: Attach additional responsibilities to an object dynamically at runtime, as a flexible
 * alternative to subclassing for extending functionality.
 *
 * How it works here:
 *   - Car is the component interface with assemble().
 *   - BasicCar is the base concrete component — assembles the core car.
 *   - CarDecorator wraps any Car and delegates assemble() to it (this is the key bridge).
 *   - SportsCar and LuxuryCar extend CarDecorator: they call super.assemble() first (delegating
 *     to the wrapped car), then append their own behaviour.
 *   - Decorators can be stacked: SportsCar(LuxuryCar(BasicCar)) chains all three behaviours
 *     in order, without creating a SportsLuxuryCar subclass.
 *
 * Each decorator is unaware of what it wraps — it only knows it has a Car to delegate to.
 *
 * @author sumit
 */

package com.design.patterns.structural.decorator;

public class DecoratorDemo {

    public static void main(String[] args) {
        // BasicCar + Sports features
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        // BasicCar + Luxury features
        Car luxuryCar = new LuxuryCar(new BasicCar());
        luxuryCar.assemble();

        // Three behaviours chained: Basic → Luxury → Sports, applied in wrapping order
        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }

}
