package de.ricardo;

import java.util.List;

public class ShopService {

    private final ProductRepo productRepo;
    private final OrderRepoInterface orderRepo;

    public ShopService(ProductRepo productRepo, OrderRepoInterface orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    public void placeOrder(int orderId, List<Product> products) {
        double totalPrice = 0;

        for (Product product : products) {
            if (productRepo.getProductById(product.id()) == null) {
                System.out.println("Product not found: " + product);
                return;
            }
            totalPrice += product.price();
        }

        Order order = new Order(orderId, products, totalPrice);
        orderRepo.addOrder(order);
        System.out.println("Order placed successfully: " + order);
    }
}
