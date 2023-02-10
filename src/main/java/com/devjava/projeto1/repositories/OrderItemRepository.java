package com.devjava.projeto1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjava.projeto1.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
