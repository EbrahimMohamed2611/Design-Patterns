package designPatterns.behaviuoral.specification;

public class AgeSpecification implements Specification {
    private int min;
    private int max;

    public AgeSpecification(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean isSatisfied(CV cv) {
        return cv.getAge() >= min && cv.getAge() <= max;
    }
}
