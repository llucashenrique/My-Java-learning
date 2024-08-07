package academy.devdojo.maratonajava.javacore.Ebootblocks.domain;

public class Product {

    private String name;

    private double price;
    private double result;

    private double discount = 10;

    {
        discount = discount - (discount * 0.05);
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        result = price - discount;
        Printer();
    }


    public void Printer() {
        System.out.println(name);
        System.out.println(price);
        System.out.println(discount);
        System.out.println(result);

    }
}
