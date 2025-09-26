package com.example.OrderManagementSystemApplication.dto;

import lombok.Data;

@Data
public class OrderRequest {
	
	private Long productId;
    private int quantity;

}
