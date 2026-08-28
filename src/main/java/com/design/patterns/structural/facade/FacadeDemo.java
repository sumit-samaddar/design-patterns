/**
 * Facade Pattern Demo
 *
 * Intent: Provide a simplified, unified interface to a complex subsystem so that clients
 * don't need to understand or depend on its internal components.
 *
 * How it works here:
 *   - The subsystem has multiple classes: Report, ReportHeader, ReportFooter, ReportData, ReportWriter.
 *   - Without the facade, the client would need to instantiate and wire all of these manually.
 *   - ReportGeneratorFacade.generateReport(ReportType) handles the full workflow internally:
 *       1. Creates and assembles the Report object (header, footer, data).
 *       2. Selects the correct ReportWriter strategy (HTML or PDF) based on the type enum.
 *       3. Writes the report.
 *   - The client only calls one method and stays decoupled from subsystem internals.
 *
 * @author sumit
 */

package com.design.patterns.structural.facade;

public class FacadeDemo {

    public static void main(String[] args) throws Exception {
        ReportGeneratorFacade reportGeneratorFacade = new ReportGeneratorFacade();

        // Client requests an HTML report — all assembly and writing is handled inside the facade
        reportGeneratorFacade.generateReport(ReportType.HTML);

        // Switching to PDF requires no client-side changes — only the enum value differs
        reportGeneratorFacade.generateReport(ReportType.PDF);
    }
}
