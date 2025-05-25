package Lab4;

import org.example.Lab4.Task2.Order;
import org.example.Lab4.Task2.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class Task2 {
    @Mock
    private OrderService mockedOrderService;

    @Mock
    private OrderDAO mockedOrderDAO;

    @Test
    public void shouldCreateCorrectOrder(){
        Order order = new Order(1);
        OrderController orderController = new OrderController(mockedOrderService);

        orderController.CreateOrder(order);

        verify(mockedOrderService).createOrder(order);
    }

    @Test
    public void shouldSaveCorrectOrder(){
        Order order = new Order(1);
        OrderService orderService = new OrderService(mockedOrderDAO);

        orderService.createOrder(order);

        verify(mockedOrderDAO).saveOrder(order);
    }
}
