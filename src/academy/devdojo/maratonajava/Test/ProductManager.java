package academy.devdojo.maratonajava.Test;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductManager {
    private List<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        products.sort(Comparator.comparingDouble(Product::getPrice));
    }

    public List<Product> getProducts() {
        return products;
    }
}


