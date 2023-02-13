package com.example.jwtauthorization.dto;

import lombok.Data;

@Data
public class UpdateUserPasswordDto {
    private String phoneNumber;
    private String email;
    private String password;
}
