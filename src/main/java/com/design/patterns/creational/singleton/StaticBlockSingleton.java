package com.design.patterns.creational.singleton;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.log4j.Logger;

/**
 * @author sumit
 *
 */
public class StaticBlockSingleton {
    final static Logger log = Logger.getLogger(StaticBlockSingleton.class);
    private static StaticBlockSingleton instance;
    
    private StaticBlockSingleton(){}
    
    //static block initialization for exception handling
    static{
        try{
            log.info("StaticBlockSingleton instance created");
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            log.error("Exception occured in creating singleton instance due to "+ ExceptionUtils.getStackTrace(e));
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    
    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}