package com.PaymentGateway.service;

import com.PaymentGateway.entity.Order;
import com.PaymentGateway.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order saveOrder(Order order) {
        // Add any additional logic or database interactions here
        return orderRepository.save(order);
    }
}
