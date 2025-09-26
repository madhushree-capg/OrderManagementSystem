package com.example.OrderManagementSystemApplication.entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity

@Table(name = "customer_order") // or "orders"
public class Order {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quantity;
    private Date date;
    private Date shippingDate;
    private Date deliveryDate;
    private String status;
    private boolean paymentVerified;

    public void setOrderDate(Date date) {
        this.date = date;
    }

}
