package designPatterns.behaviuoral.specification;

public class ConceptsSpecification implements Specification{
    private String concept;

    public ConceptsSpecification(String concept) {
        this.concept = concept;
    }

    @Override
    public boolean isSatisfied(CV cv) {
        return cv.getConcepts().contains(concept);
    }
}
