package designPatterns.behaviuoral.specification;

import java.util.List;

public class ORSpecification implements Specification {
    private final List<Specification> specifications;

    public ORSpecification(List<Specification> specifications) {
        this.specifications = specifications;
    }

    @Override
    public boolean isSatisfied(CV cv) {
        for (Specification specification : specifications)
            if (specification.isSatisfied(cv))
                return true;
        return false;
    }
}
