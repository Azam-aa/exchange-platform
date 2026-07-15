package com.azam.exchange.users.dto;

import lombok.Data;

@Data
public class RegisterRequest {

    private String firstName;

    private String lastName;

    private String contactNumber;

    private String email;

    private String password;

}