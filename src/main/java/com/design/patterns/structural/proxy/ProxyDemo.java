/**
 * Proxy Pattern Demo
 *
 * Intent: Provide a surrogate that controls access to another object — here used as a
 * Virtual Proxy to defer expensive object creation until it is actually needed.
 *
 * How it works here:
 *   - Image is the common interface with display().
 *   - RealImage loads the image file from disk in its constructor (expensive operation).
 *   - ImageProxy holds only the file name; it does NOT create RealImage at construction time.
 *   - On the first display() call, ImageProxy creates the RealImage (lazy init) and delegates.
 *   - On subsequent display() calls, the already-loaded RealImage is reused — no reload.
 *
 * The client holds an Image reference and never distinguishes proxy from real object.
 *
 * @author sumit
 */

package com.design.patterns.structural.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProxyDemo {
    final static Logger log = LoggerFactory.getLogger(ProxyDemo.class);

    public static void main(String[] args) {
        // Proxy is created instantly — RealImage (and its disk I/O) is NOT triggered yet
        Image image = new ImageProxy("profile-pic.jpg");
        log.info("Image proxy created — no disk I/O yet");

        // First display: proxy creates RealImage, loads file from disk, then displays
        image.display();

        // Second display: RealImage already exists in proxy; file is NOT loaded again
        image.display();
    }
}