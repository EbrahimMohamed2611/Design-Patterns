package designPatterns.structural.bridge.implementation;

public class FirstGrade extends Grade {

    @Override
    public void showReport() {
        this.getReport().show();
    }
}
