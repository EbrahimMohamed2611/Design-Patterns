package designPatterns.structural.bridge;

import designPatterns.structural.bridge.abstration.HTMLReport;
import designPatterns.structural.bridge.abstration.XMLRepost;
import designPatterns.structural.bridge.implementation.FirstGrade;
import designPatterns.structural.bridge.implementation.Grade;

public class Main {
    public static void main(String[] args) {
        Grade firstGrade = new FirstGrade();
        firstGrade.setReport(new HTMLReport());
        firstGrade.showReport();

        Grade secondGrade = new FirstGrade();
        secondGrade.setReport(new XMLRepost());
        secondGrade.showReport();
    }
}
