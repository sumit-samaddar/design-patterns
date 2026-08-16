/**
 * @author sumit
 */

package com.design.patterns.structural.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

enum ReportType {
    PDF, HTML
}

/**
 * @author sumit
 */
public class Report {

    final static Logger log = LoggerFactory.getLogger(Report.class);
    private ReportHeader header;
    private ReportData data;
    private ReportFooter footer;

    public ReportHeader getHeader() {
        return header;
    }

    public void setHeader(ReportHeader header) {
        log.info("Setting report header");
        this.header = header;
    }

    public void setData(ReportData data) {
        log.info("Setting report data");
        this.data = data;
    }

    public void setFooter(ReportFooter footer) {
        log.info("Setting report footer");
        this.footer = footer;
    }
}

/**
 * @author sumit
 */
class ReportHeader {
}

/**
 * @author sumit
 */
class ReportData {
}

/**
 * @author sumit
 */
class ReportFooter {
}

/**
 * @author sumit
 */
class ReportWriter {

    final static Logger log = LoggerFactory.getLogger(ReportWriter.class);

    public void writeHtmlReport(Report report) {
        log.info("HTML Report written");
    }

    public void writePdfReport(Report report) {
        log.info("Pdf Report written");
    }

}
