package com.design.patterns.structural.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RealImage implements Image {
    final static Logger log = LoggerFactory.getLogger(RealImage.class);
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        log.info("Loading image: " + fileName);
    }

    @Override
    public void display() {
        log.info("Displaying image: " + fileName);
    }
}
