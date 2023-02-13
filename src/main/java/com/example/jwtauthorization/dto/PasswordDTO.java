package com.example.jwtauthorization.dto;

import lombok.Data;

@Data
public class PasswordDTO {
    private String password;
    private String otp;
    private String nationalId;
}
