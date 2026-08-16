/**
 * @author sumit
 * Controls access to an object through a representative proxy layer.
 */

package com.design.patterns.structural.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProxyDemo {
    final static Logger log = LoggerFactory.getLogger(ProxyDemo.class);

    public static void main(String[] args) {

        Image image = new ImageProxy("profile-pic.jpg");

        log.info("Image created");

        image.display(); // loads + displays
        image.display(); // only displays
    }
}