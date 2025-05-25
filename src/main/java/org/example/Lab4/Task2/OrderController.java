package org.example.Lab4.Task2;

public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    public void CreateOrder(Order order){
        orderService.createOrder(order);
    }
}
