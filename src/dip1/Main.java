package dip1;

import dip1.model.Report;
import dip1.model.ReportManager;
import dip1.model.util.ReportPrinter;
import logger.Log;
import java.io.FileInputStream;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Log.log(Main.class.getName());
    public static void main(String[] args) {
        log.log(Level.INFO, "Method main in model package started");
        Report report = new Report();
        report.calculate();
        ReportManager reportManager = new ReportManager(new ReportPrinter());
        reportManager.ToOutput(report.getItems());
    }
}
