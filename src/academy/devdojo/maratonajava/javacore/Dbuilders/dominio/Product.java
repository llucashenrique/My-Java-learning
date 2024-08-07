package academy.devdojo.maratonajava.javacore.Dbuilders.dominio;

public class Product {

    private String name;
    private double price;
    private int quantities;

    public Product(String name, double price, int quantities) {
        this.quantities = quantities;
        this.price = price;
        this.name = name;
        printer();
    }
    public void printer() {
        System.out.println(name);
        System.out.println(price);
        System.out.println(quantities);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantities(int quantities) {
        this.quantities = quantities;
    }
}
