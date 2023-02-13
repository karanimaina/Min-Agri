package com.example.jwtauthorization.dto;

import lombok.Data;

@Data
public class UpdateUserPassword {
    private String phoneNumber;
    private String email;
    private String password;
}
