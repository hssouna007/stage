package com.springdata.ecommerce.service;

import com.springdata.ecommerce.models.Order;
import com.springdata.ecommerce.models.User;
import java.util.List;

public interface OrderService {
    Order createOrder(User user, List<Order> items);
    Order createOrder(Order order);
    // Declare other order management methods here
}