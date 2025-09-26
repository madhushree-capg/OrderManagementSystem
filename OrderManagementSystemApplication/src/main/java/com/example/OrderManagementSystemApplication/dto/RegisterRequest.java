package com.example.OrderManagementSystemApplication.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RegisterRequest {
	
	@NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String password;
    private String role="USER";
    private String city;
    private String street;
    private String landmark;
    private String state;
    private String pin;
    private String phone;

}
