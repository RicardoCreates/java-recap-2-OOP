package de.ricardo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderMapRepo implements OrderRepoInterface {

    private Map<Integer, Order> orderMap;

    public OrderMapRepo() {
        this.orderMap = new HashMap<>();
    }

    @Override
    public void addOrder(Order order) {
        orderMap.put(order.id(), order);
    }

    @Override
    public void removeOrder(Order order) {
        orderMap.remove(order.id());
    }

    @Override
    public Order getOrderById(int id) {
        return orderMap.get(id);
    }

    @Override
    public List<Order> getAllOrders() {
        return List.copyOf(orderMap.values());
    }
}
