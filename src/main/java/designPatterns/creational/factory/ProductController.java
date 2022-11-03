package designPatterns.creational.factory;

import java.util.HashMap;

public class ProductController extends Controller {

    public void listProducts() {
        HashMap<String, Object> objectObjectHashMap = new HashMap<>();
        render("product.html", objectObjectHashMap);
    }

    @Override
    protected ViewEngin createViewEngine() {
        return new DjangoViewEngine();
    }
}
