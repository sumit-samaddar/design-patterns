package com.design.patterns.structural.facade;

/**
 * @author sumit
 */
public class FacadeDemo {

    public static void main(String[] args) throws Exception {
        ReportGeneratorFacade reportGeneratorFacade = new ReportGeneratorFacade();
        reportGeneratorFacade.generateReport(ReportType.HTML);
        reportGeneratorFacade.generateReport(ReportType.PDF);
    }
}
