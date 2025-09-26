package com.example.OrderManagementSystemApplication.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.OrderManagementSystemApplication.entity.Order;
import com.example.OrderManagementSystemApplication.service.OrderService;


@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderService orderServcie;
	
	//need some code by user class
    @GetMapping
    public List<Order> getAllOrders() {
        return orderServcie.getAllOrders();
    }
    // Manager: Manage delivery dates
    @PutMapping("/{id}/dates")
    public ResponseEntity<Order> updateDates(@PathVariable Long id, @RequestParam Date shippingDate, @RequestParam Date deliveryDate) {
        return ResponseEntity.ok(orderServcie.updateOrderDates(id, shippingDate, deliveryDate));
    }
}
