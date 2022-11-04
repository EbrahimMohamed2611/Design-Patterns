package designPatterns.structural.bridge.implementation;

public class ThirdGrade extends Grade {

    @Override
    public void showReport() {
        this.getReport().show();
    }
}
