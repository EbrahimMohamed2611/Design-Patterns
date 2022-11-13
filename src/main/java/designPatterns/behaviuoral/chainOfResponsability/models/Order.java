package designPatterns.behaviuoral.chainOfResponsability.models;

import java.util.Date;

public class Order {
    private final User user;
    private final Product product;
    private final Date shipmentDate;

    public Order(User user, Product product, Date shipmentDate) {
        this.user = user;
        this.product = product;
        this.shipmentDate = shipmentDate;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public Date getShipmentDate() {
        return shipmentDate;
    }
}
