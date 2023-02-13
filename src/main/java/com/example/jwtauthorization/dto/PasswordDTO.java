package com.example.jwtauthorization.dto;

import lombok.Data;

@Data
public class PasswordDTO {
    String password;
    String otp;
    String nationalid;
}
