package com.example.OrderManagementSystemApplication.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OrderManagementSystemApplication.dao.OrderRepository;
import com.example.OrderManagementSystemApplication.entity.Order;


@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	
	//need userclass to get order
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
    public Order updateOrderDates(Long orderId, Date shippingDate, Date deliveryDate) {
        Order order = orderRepository.findById(orderId).orElseThrow();
        order.setShippingDate(shippingDate);
        order.setDeliveryDate(deliveryDate);
        return orderRepository.save(order);
    }
    public Order updateStatus(Long orderId, String status) {
        Order order = orderRepository.findById(orderId).orElseThrow();
        order.setStatus(status);
        return orderRepository.save(order);
    }
    public Order verifyPayment(Long orderId) {
        Order order = orderRepository.findById(orderId).orElseThrow();
        order.setPaymentVerified(true);
        return orderRepository.save(order);
    }
    public Optional<Order> getOrderById(Long orderId) {
        return orderRepository.findById(orderId);
    }
}
