package com.design.patterns.structural.proxy;

import org.apache.log4j.Logger;

public class RealImage implements Image {
    final static Logger log = Logger.getLogger(RealImage.class);
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
