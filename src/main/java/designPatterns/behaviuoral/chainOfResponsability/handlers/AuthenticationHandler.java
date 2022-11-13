package designPatterns.behaviuoral.chainOfResponsability.handlers;

import designPatterns.behaviuoral.chainOfResponsability.Handler;
import designPatterns.behaviuoral.chainOfResponsability.exceptions.ProductException;
import designPatterns.behaviuoral.chainOfResponsability.exceptions.ShipmentException;
import designPatterns.behaviuoral.chainOfResponsability.exceptions.UserException;
import designPatterns.behaviuoral.chainOfResponsability.models.Order;

public class AuthenticationHandler extends Handler {

    @Override
    public void handle(Order order) throws UserException, ShipmentException, ProductException {
        // here we need to do the specific logic and pass the request to another handler
        if (order.getUser().getName().equals("ebrahim")) {
            System.out.println("Authenticate.....");
            if (getNext() != null)
                getNext().handle(order);
        } else
            throw new UserException("This user not authenticated....");
    }
}
