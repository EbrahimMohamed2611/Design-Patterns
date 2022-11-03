package designPatterns.behaviuoral.specification;

import java.util.List;

public class ANDSpecification implements Specification{
    private final List<Specification> specifications;

    public ANDSpecification(List<Specification> specifications) {
        this.specifications = specifications;
    }

    @Override
    public boolean isSatisfied(CV cv) {
        for (Specification specification : specifications)
                if(!specification.isSatisfied(cv))
                    return false;
        return true;
    }
}
