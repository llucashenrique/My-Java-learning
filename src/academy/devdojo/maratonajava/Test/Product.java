package academy.devdojo.maratonajava.Test;

public class Product {
    private String name;
    private String description;
    private double price;
    private boolean available;

    public Product(String name, String description, double price, boolean available) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, Valor: %.2f", name, price);
    }
}


