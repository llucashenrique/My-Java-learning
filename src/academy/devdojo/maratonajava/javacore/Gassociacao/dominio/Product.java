package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Product {

    private String name;

    private double price;

    private double stock;

    public Product(String name, double price, double stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getStock() {
        return stock;
    }
}
