package com.udemy.udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.udemy.entities.OrderItem;
import com.udemy.udemy.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}