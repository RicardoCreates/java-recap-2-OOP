package de.ricardo;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo implements OrderRepoInterface {

    private List<Order> orders;

    public OrderListRepo() {
        this.orders = new ArrayList<>();
    }

    @Override
    public void addOrder(Order order) {
        orders.add(order);
    }

    @Override
    public void removeOrder(Order order) {
        orders.remove(order);
    }

    @Override
    public Order getOrderById(int id) {
        for (Order order : orders) {
            if (order.id() == id) {
                return order;
            }
        }
        return null;
    }

    @Override
    public List<Order> getAllOrders() {
        return orders;
    }
}
