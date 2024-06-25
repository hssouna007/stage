package com.springdata.ecommerce.service;

import com.springdata.ecommerce.models.Order;
import com.springdata.ecommerce.models.User;
import com.springdata.ecommerce.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order createOrder(User user, List<Order> items) {
        Order order = new Order();
        order.setUser(user);
        order.setItems(items); // Assuming Order has a setItems method
        return orderRepository.save(order);
    }

    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    // Implement other order management methods here
}
