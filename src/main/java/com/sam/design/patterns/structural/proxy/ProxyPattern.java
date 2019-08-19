package com.sam.design.patterns.structural.proxy;

/*
 * The definition itself is very clear and proxy design pattern is used when we want to provide controlled access of a 
 * functionality.Let�s say we have a class that can run some command on the system. Now if we are using it, its fine but 
 * if we want to give this program to a client application, it can have severe issues because client program can issue 
 * command to delete some system files or change some settings that you don�t want.
 */


import com.sam.design.patterns.behavioral.state.DeliveredState;
import org.apache.log4j.Logger;

/**
 * @author sumit
 *
 */
public class ProxyPattern {

	final static Logger log = Logger.getLogger(DeliveredState.class);

	public static void main(String[] args){
		CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			log.error("Exception Message::"+e.getMessage());
		}
		
	}

}
