package designPatterns.creational.factory;

import java.util.Map;

//We can also make the class abstract to provide the factory method as an abstract
public class Controller {
    public void render(String viewName, Map<String, Object> context){
//        SpringViewEngine springViewEngine = new SpringViewEngine();
//        String renderedView = engin.render(viewName, context);
        ViewEngin viewEngine = createViewEngine();
        String renderedView = viewEngine.render(viewName, context);
        System.out.println(renderedView);
    }

    // also, we can make it abstract and force the subclasses to provide the implementation
    protected ViewEngin createViewEngine(){
        return new SpringViewEngine();//default implementation
    }
}
