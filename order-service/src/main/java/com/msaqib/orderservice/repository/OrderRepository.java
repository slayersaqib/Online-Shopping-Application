package com.msaqib.orderservice.repository;

import com.msaqib.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

// Here Type is Order and primary key is Long
public interface OrderRepository extends JpaRepository<Order, Long> {
}
