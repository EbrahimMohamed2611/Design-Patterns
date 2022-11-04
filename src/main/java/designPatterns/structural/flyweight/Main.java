package designPatterns.structural.flyweight;

public class Main {
    public static void main(String[] args) {
        PointService pointService = new PointService(new PointFactory());
        for (Point point : pointService.getPoints())
            point.draw();
    }
}
