package designPatterns.behaviuoral.specification;

import java.util.List;

public class LanguageSpecification implements Specification{
    private final String languages;

    public LanguageSpecification(String languages) {
        this.languages = languages;
    }

    @Override
    public boolean isSatisfied(CV cv) {
        return cv.getProgrammingLanguages().contains(languages);
    }
}
