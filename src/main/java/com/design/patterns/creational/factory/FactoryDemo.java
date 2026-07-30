package com.design.patterns.creational.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author sumit
 *
 */
public class FactoryDemo {
	final static Logger log = LoggerFactory.getLogger(FactoryDemo.class);
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");
		Computer server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "2.9 GHz");
		log.info("Factory PC Config::" + pc);
		log.info("Factory Server Config::" + server);
	}

}
