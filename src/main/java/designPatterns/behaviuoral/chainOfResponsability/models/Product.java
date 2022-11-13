package designPatterns.behaviuoral.chainOfResponsability.models;

public class Product {
    private final Integer id;
    private final String name;
    private final Integer price;

    public Product(Integer id, String name, Integer price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }
}
