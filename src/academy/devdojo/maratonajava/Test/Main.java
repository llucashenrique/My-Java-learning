package academy.devdojo.maratonajava.Test;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Cadastrar novo produto");
            System.out.println("2. Listar produtos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addNewProduct(productManager, scanner);
                    break;
                case 2:
                    listProducts(productManager);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }

    private static void addNewProduct(ProductManager productManager, Scanner scanner) {
        System.out.print("Nome do produto: ");
        String name = scanner.nextLine();
        System.out.print("Descrição do produto: ");
        String description = scanner.nextLine();
        System.out.print("Valor do produto: ");
        double price = scanner.nextDouble();
        System.out.print("Disponível para venda (true/false): ");
        boolean available = scanner.nextBoolean();
        scanner.nextLine(); // consume newline

        Product product = new Product(name, description, price, available);
        productManager.addProduct(product);
        System.out.println("Produto cadastrado com sucesso!");
    }

    private static void listProducts(ProductManager productManager) {
        System.out.println("Lista de Produtos:");
        for (Product product : productManager.getProducts()) {
            System.out.println(product);
        }
    }
}


