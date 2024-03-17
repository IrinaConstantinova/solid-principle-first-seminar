package dip1.model;

import java.util.List;

public class ReportManager {
    Printable printable;

    public ReportManager(Printable reportable) {
        this.printable = reportable;
    }

    public void ToOutput(List<ReportItem> items) {
        printable.print(items);

    }
}
