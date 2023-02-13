package com.example.jwtauthorization.dto;

import lombok.Data;

/**
 * @author Alex Maina
 * @created 26/10/2022
 **/
@Data
public class LoginRequest {
    private String username;
    private String password;
    private String channel;
}
