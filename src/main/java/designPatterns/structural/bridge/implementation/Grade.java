package designPatterns.structural.bridge.implementation;

import designPatterns.structural.bridge.abstration.Report;

public abstract class Grade {
    // this is a bridge between Grade and Report Implementation
    protected Report report;

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }

    public abstract void showReport();
}
