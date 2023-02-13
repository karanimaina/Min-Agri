package com.example.jwtauthorization.dto;

import lombok.Data;

@Data
public class UpdateuserPassword {
    String phonenumber;
    String email;
    String password;
}
