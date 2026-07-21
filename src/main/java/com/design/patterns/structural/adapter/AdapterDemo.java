package com.design.patterns.structural.adapter;

import org.apache.log4j.Logger;

/*One of the great real life example of Adapter design pattern is mobile charger. Mobile battery needs 3 volts to 
 * charge but the normal socket produces either 120V (US) or 240V (India). So the mobile charger works as an adapter 
 * between mobile charging socket and the wall socket.*/

/**
 * @author sumit
 *
 */
public class AdapterDemo {
	final static Logger log = Logger.getLogger(AdapterDemo.class);

	public static void main(String[] args) {
		testClassAdapter();
	}

	private static void testClassAdapter() {
		SocketAdapter sockAdapter = new SocketClassAdapterImpl();
		Volt v3 = getVolt(sockAdapter, 3);
		Volt v12 = getVolt(sockAdapter, 12);
		Volt v120 = getVolt(sockAdapter, 120);
		log.info("v3 volts using Class Adapter=" + v3.getVolts());
		log.info("v12 volts using Class Adapter=" + v12.getVolts());
		log.info("v120 volts using Class Adapter=" + v120.getVolts());
	}

	private static Volt getVolt(SocketAdapter sockAdapter, int i) {
		switch (i) {
			case 3:
				return sockAdapter.get3Volt();
			case 12:
				return sockAdapter.get12Volt();
			case 120:
				return sockAdapter.get120Volt();
			default:
				return sockAdapter.get120Volt();
		}
	}
}
