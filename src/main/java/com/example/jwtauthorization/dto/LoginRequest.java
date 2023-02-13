package com.example.jwtauthorization.dto;

import lombok.Data;

/**
 * @author Felix Maina
 * @created 02/13/2023
 **/
@Data
public class LoginRequest {
    private String username;
    private String password;
    private String channel;
}
