package designPatterns.behaviuoral.chainOfResponsability.handlers;

import designPatterns.behaviuoral.chainOfResponsability.Handler;
import designPatterns.behaviuoral.chainOfResponsability.exceptions.ProductException;
import designPatterns.behaviuoral.chainOfResponsability.exceptions.ShipmentException;
import designPatterns.behaviuoral.chainOfResponsability.exceptions.UserException;
import designPatterns.behaviuoral.chainOfResponsability.models.Order;

import java.util.Set;

public class ProductHandler extends Handler {
    private final Set<String> products = Set.of("Mac", "ASUS", "DELL");

    @Override
    public void handle(Order order) throws ProductException, UserException, ShipmentException {
        // here we need to do the specific logic and pass the request to another handler
        if (products.contains(order.getProduct().getName())) {
            System.out.println("Product is available.....");
            if (next != null)
                getNext().handle(order);  // chain the next handler
        } else
            throw new ProductException("This product is not Available....");
    }
}
