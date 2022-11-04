package designPatterns.structural.bridge.implementation;

public class SecondGrade extends Grade {

    @Override
    public void showReport() {
        this.getReport().show();
    }
}
