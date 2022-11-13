package designPatterns.behaviuoral.chainOfResponsability.handlers;

import designPatterns.behaviuoral.chainOfResponsability.Handler;
import designPatterns.behaviuoral.chainOfResponsability.exceptions.ProductException;
import designPatterns.behaviuoral.chainOfResponsability.exceptions.ShipmentException;
import designPatterns.behaviuoral.chainOfResponsability.exceptions.UserException;
import designPatterns.behaviuoral.chainOfResponsability.models.Order;

import java.util.Calendar;
import java.util.Date;

public class ShaipmentHandler extends Handler {

    @Override
    public void handle(Order order) throws ShipmentException, UserException, ProductException {
        // here we need to do the specific logic and pass the request to another handler
        if (order.getShipmentDate().equals(new Date(2022, Calendar.DECEMBER,13))) {
            System.out.println("Shipment.....");
            if (next != null)
                getNext().handle(order);  // chain the next handler
        }else
            throw new ShipmentException("This order cannot shipment in this date....");
    }
}
