package com.design.patterns.structural.proxy;

import org.apache.log4j.Logger;

public class ProxyDemo {
    final static Logger log = Logger.getLogger(ProxyDemo.class);

    public static void main(String[] args) {

        Image image = new ImageProxy("profile-pic.jpg");

        log.info("Image created");

        image.display(); // loads + displays
        image.display(); // only displays
    }
}