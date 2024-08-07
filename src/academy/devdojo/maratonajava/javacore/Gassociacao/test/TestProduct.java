package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Product;

public class TestProduct {
    public static void main(String[] args) {
        Product[] products = {
                new Product("Notebook", 3000.0, 50),
                new Product("Mouse", 150.0, 200),
                new Product("Keyboard", 200.0, 10)
        };

        System.out.println("Which is the price of product called Keyboard? ");
        for (Product product : products) {
            if (product.getName().equals("Keyboard")) {
                System.out.println("The price is: " + product.getPrice());
                break;
            }
        }

        System.out.println("-----------------------------------------");

        System.out.println("How much units of Mouse there are stock? ");
        for (Product product : products) {
            if (product.getName().equals("Mouse")) {
                System.out.println("There are: " + product.getStock() + " units");
                break;
            }
        }

        System.out.println("-------------------------------------------");

        System.out.println("What's name the name of product how costs 3000 dollars? ");
        for (Product product : products) {
            if (product.getPrice() == 3000.0) {
                System.out.println("The name of product is : " + product.getName());
                break;
            }
        }
    }
}
