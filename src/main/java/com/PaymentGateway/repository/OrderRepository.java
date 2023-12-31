package com.PaymentGateway.repository;

import com.PaymentGateway.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    // You can add custom methods here if needed
}
