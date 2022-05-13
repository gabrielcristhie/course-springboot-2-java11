package com.udemy.udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.udemy.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}