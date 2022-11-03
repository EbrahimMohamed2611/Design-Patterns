package designPatterns.creational.factory;

import java.util.Map;

public class SpringViewEngine implements ViewEngin{

    @Override
    public String render(String viewName, Map<String, Object> context) {
        //do some processing to process the data to return it to display in html view
        return viewName + " is Rendered By Spring View Engin";
    }
}
