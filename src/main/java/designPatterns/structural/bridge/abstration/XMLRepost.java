package designPatterns.structural.bridge.abstration;

public class XMLRepost  implements Report{
    @Override
    public void show() {
        System.out.println("<?xml> XML Report </xml>");
    }
}
