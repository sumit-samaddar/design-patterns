package com.design.patterns.structural.decorator;

import org.apache.log4j.BasicConfigurator;

/**
 * @author sumit
 */
public class DecoratorPattern {

    public static void main(String[] args) {
        BasicConfigurator.configure();
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }

}
