/**
 * @author sumit
 * Simplifies a complex subsystem behind a single easy-to-use interface.
 */

package com.design.patterns.structural.facade;

public class FacadeDemo {

    public static void main(String[] args) throws Exception {
        ReportGeneratorFacade reportGeneratorFacade = new ReportGeneratorFacade();
        reportGeneratorFacade.generateReport(ReportType.HTML);
        reportGeneratorFacade.generateReport(ReportType.PDF);
    }
}
