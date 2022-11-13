package designPatterns.behaviuoral.chainOfResponsability;

import designPatterns.behaviuoral.chainOfResponsability.exceptions.ProductException;
import designPatterns.behaviuoral.chainOfResponsability.exceptions.ShipmentException;
import designPatterns.behaviuoral.chainOfResponsability.exceptions.UserException;
import designPatterns.behaviuoral.chainOfResponsability.models.Order;

public abstract class Handler {

    protected Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return this.next;
    }

    public abstract void handle(Order order) throws UserException, ProductException, ShipmentException;

    public Handler getNext() {
        return next;
    }
}
