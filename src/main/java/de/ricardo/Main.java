package de.ricardo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductRepo productRepo = new ProductRepo();

        Product macbook = new Product("Macbook", "Apple", "Pro", 2499, 123456);
        Product gamingLaptop = new Product("Gaming Laptop", "Razor", "Blade", 2399, 123457);
        Product gamingPC = new Product("Gaming PC", "Asus", "Game on", 1499, 123458);

        productRepo.addProduct(macbook);
        productRepo.addProduct(gamingLaptop);
        productRepo.addProduct(gamingPC);

        productRepo.getProducts();

        OrderRepoInterface orderRepo = new OrderListRepo();
        ShopService shopService = new ShopService(productRepo, orderRepo);

        shopService.placeOrder(1, List.of(macbook, gamingLaptop));
        shopService.placeOrder(2, List.of(gamingPC, new Product("Non-Existent", "Brand", "Type", 0, 999999)));
    }
}
