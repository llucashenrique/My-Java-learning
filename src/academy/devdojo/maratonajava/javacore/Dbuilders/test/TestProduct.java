package academy.devdojo.maratonajava.javacore.Dbuilders.test;

import academy.devdojo.maratonajava.javacore.Dbuilders.dominio.Product;

import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        Product product = new Product(" ", 0, 0);
        Scanner sc = new Scanner(System.in);

        System.out.println("What name this product? ");
        product.setName(sc.next());

        System.out.println("How much costs this product? ");
        product.setPrice(sc.nextDouble());

        System.out.println("How many? ");
        product.setQuantities(sc.nextInt());

        product.printer();
    }
}
