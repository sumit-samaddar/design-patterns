package com.design.patterns.structural.facade;

import org.apache.log4j.BasicConfigurator;

/**
 * @author sumit
 */
public class FacadePattern {

    public static void main(String[] args) throws Exception {
        BasicConfigurator.configure();
        ReportGeneratorFacade reportGeneratorFacade = new ReportGeneratorFacade();
        ReportGeneratorFacade.generateReport(ReportType.HTML);
        ReportGeneratorFacade.generateReport(ReportType.PDF);
    }
}
