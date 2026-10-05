package uk.ac.westminster.products_api;

public class Product {

    private Long ID;
    private String name;
    private double price;

    public Product(Long ID, String name, double price){
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Long getID() {
        return ID;
    }
}
