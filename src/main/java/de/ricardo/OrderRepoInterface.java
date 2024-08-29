package de.ricardo;

import java.util.List;

public interface OrderRepoInterface {
    void addOrder(Order order);
    void removeOrder(Order order);
    Order getOrderById(int id);
    List<Order> getAllOrders();
}
