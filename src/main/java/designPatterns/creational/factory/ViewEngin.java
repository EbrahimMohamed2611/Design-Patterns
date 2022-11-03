package designPatterns.creational.factory;

import java.util.Map;

public interface ViewEngin {
    String render(String viewName, Map<String, Object> context);
}
