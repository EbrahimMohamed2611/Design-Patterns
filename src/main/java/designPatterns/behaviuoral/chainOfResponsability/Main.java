package designPatterns.behaviuoral.chainOfResponsability;

import designPatterns.behaviuoral.chainOfResponsability.exceptions.OrderException;
import designPatterns.behaviuoral.chainOfResponsability.handlers.AuthenticationHandler;
import designPatterns.behaviuoral.chainOfResponsability.handlers.ProductHandler;
import designPatterns.behaviuoral.chainOfResponsability.handlers.ShaipmentHandler;
import designPatterns.behaviuoral.chainOfResponsability.models.Order;
import designPatterns.behaviuoral.chainOfResponsability.models.Product;
import designPatterns.behaviuoral.chainOfResponsability.models.User;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, "ebrahim");
        Product product = new Product(1, "ASUS", 31000);
        Order order = new Order(user, product, new Date(2022, Calendar.DECEMBER, 13));

        Handler handler = new AuthenticationHandler();
        handler.setNext(new ProductHandler())
                .setNext(new ShaipmentHandler());

        try {
            handler.handle(order);
        } catch (OrderException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
