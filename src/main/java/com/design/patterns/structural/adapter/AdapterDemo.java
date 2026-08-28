/**
 * Adapter Pattern Demo
 *
 * Intent: Allow two incompatible interfaces to work together by wrapping one inside an adapter
 * that translates calls from the expected interface to the existing one.
 *
 * Real-world analogy: A mobile charger adapts a 120 V wall socket to the 3 V a phone needs.
 *
 * How it works here:
 *   - Socket (existing class) only knows how to supply 120 V via getVolt().
 *   - SocketAdapter (target interface) declares get3Volt(), get12Volt(), get120Volt().
 *   - SocketAdapterImpl extends Socket AND implements SocketAdapter — it adapts the 120 V source
 *     by performing integer division: 120/40 = 3 V, 120/10 = 12 V, 120/1 = 120 V.
 *   - The client (AdapterDemo) only talks to the SocketAdapter interface; Socket is never called directly.
 *
 * Class Adapter (used here): adapter inherits the adaptee via extends.
 * Object Adapter (alternative): adapter holds the adaptee as a field via composition.
 *
 * @author sumit
 */

package com.design.patterns.structural.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdapterDemo {
    final static Logger log = LoggerFactory.getLogger(AdapterDemo.class);

    public static void main(String[] args) {
        testClassAdapter();
    }

    private static void testClassAdapter() {
        // SocketAdapterImpl bridges the raw 120 V socket to the three voltages the client needs
        SocketAdapter sockAdapter = new SocketAdapterImpl();

        Volt v3   = getVolt(sockAdapter, 3);    // 120 / 40 = 3 V  — for mobile charging
        Volt v12  = getVolt(sockAdapter, 12);   // 120 / 10 = 12 V — for car accessories
        Volt v120 = getVolt(sockAdapter, 120);  // raw wall voltage — passed through unchanged

        log.info("v3 volts using Class Adapter={}", v3.getVolts());
        log.info("v12 volts using Class Adapter={}", v12.getVolts());
        log.info("v120 volts using Class Adapter={}", v120.getVolts());
    }

    // Routes the voltage request to the correct adapter method
    private static Volt getVolt(SocketAdapter sockAdapter, int i) {
        switch (i) {
            case 3:   return sockAdapter.get3Volt();
            case 12:  return sockAdapter.get12Volt();
            default:  return sockAdapter.get120Volt();
        }
    }
}
