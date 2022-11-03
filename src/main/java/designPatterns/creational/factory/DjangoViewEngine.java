package designPatterns.creational.factory;

import java.util.Map;

public class DjangoViewEngine implements ViewEngin {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return viewName + " rendered By DjangoViewEngine";
    }
}
