package org.example;

public class ExportReportPrinter {
    public void printReport(Exportable exportable) {
        System.out.println("Documento de exportación generado:");
        System.out.println(exportable.getExportInfo());
    }
}
