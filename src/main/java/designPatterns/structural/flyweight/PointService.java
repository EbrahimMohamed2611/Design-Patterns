package designPatterns.structural.flyweight;

import java.util.Arrays;
import java.util.List;

public class PointService {

    private final PointFactory factory;

    public PointService(PointFactory factory) {
        this.factory = factory;
    }

    public List<Point> getPoints(){
        List<Point> points = Arrays.asList(
                new Point(1,2,factory.getPointIcon(PointType.RESTAURANT)),
                new Point(1,2,factory.getPointIcon(PointType.COFFEE)),
                new Point(1,2,factory.getPointIcon(PointType.HOSPITAL)));
        return points;
    }
}
