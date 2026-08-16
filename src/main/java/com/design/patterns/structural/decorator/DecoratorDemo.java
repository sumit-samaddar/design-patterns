/**
 * @author sumit
 * Adds behavior dynamically to objects without changing their core type.
 */

package com.design.patterns.structural.decorator;

public class DecoratorDemo {

    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        Car luxuryCar = new LuxuryCar(new BasicCar());
        luxuryCar.assemble();

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }

}
