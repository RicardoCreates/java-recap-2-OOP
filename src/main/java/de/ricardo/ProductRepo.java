package de.ricardo;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {

    private List<Product> products;

    public ProductRepo() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void getProducts() {
        System.out.println("all Products: ");
        for (Product product : products) {
            System.out.println(product);
        };
    }

    public Product getProductById(int id) {
        for (Product product : products) {
            if (product.id() == id) {
                return product;
            }
        }
        return null;
    }


}
