/**
 * @author sumit
 */

package com.design.patterns.structural.facade;

public class ReportGeneratorFacade {
    public void generateReport(ReportType type) {
        // Create report
        Report report = new Report();
        report.setHeader(new ReportHeader());
        report.setFooter(new ReportFooter());
        report.setData(new ReportData());
        // Write report
        ReportWriter writer = new ReportWriter();
        switch (type) {
            case HTML:
                writer.writeHtmlReport(report);
                break;
            case PDF:
                writer.writePdfReport(report);
                break;
        }
    }
}
