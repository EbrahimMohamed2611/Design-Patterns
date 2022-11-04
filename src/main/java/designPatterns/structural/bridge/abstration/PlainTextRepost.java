package designPatterns.structural.bridge.abstration;

public class PlainTextRepost implements Report{
    @Override
    public void show() {
        System.out.println("Report");
    }
}
