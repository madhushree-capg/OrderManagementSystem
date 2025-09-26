package com.example.OrderManagementSystemApplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OrderManagementSystemApplication.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
