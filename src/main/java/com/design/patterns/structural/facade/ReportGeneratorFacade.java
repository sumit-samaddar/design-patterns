package com.design.patterns.structural.facade;

/**
 * @author sumit
 */
public class ReportGeneratorFacade {
    public static void generateReport(ReportType type) {

        //Create report
        Report report = new Report();

        report.setHeader(new ReportHeader());
        report.setFooter(new ReportFooter());
        report.setData(new ReportData());

        //Write report
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
