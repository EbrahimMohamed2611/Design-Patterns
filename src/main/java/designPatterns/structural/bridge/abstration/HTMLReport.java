package designPatterns.structural.bridge.abstration;

public class HTMLReport implements Report {
    @Override
    public void show() {
        System.out.println("<p> HTML Report </>");
    }
}
