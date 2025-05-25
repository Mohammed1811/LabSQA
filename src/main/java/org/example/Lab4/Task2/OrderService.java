package org.example.Lab4.Task2;

import org.example.Lab4.Task2.Order;
import org.example.Lab4.Task2.OrderDAO;

public class OrderService{
    private OrderDAO orderDAO;

    public OrderService(OrderDAO orderDAO) {
        this.orderDAO = orderDAO;
    }

    public void createOrder(Order order){
        orderDAO.saveOrder(order);
    }
}
