package com.design.patterns.structural.proxy;

import com.design.patterns.behavioral.state.DeliveredState;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * @author sumit
 */
public class ProxyPattern {

    final static Logger log = Logger.getLogger(DeliveredState.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            log.error("Exception Message::" + e.getMessage());
        }

    }

}
