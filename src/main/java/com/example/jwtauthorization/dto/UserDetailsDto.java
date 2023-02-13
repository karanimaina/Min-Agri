package com.example.jwtauthorization.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Class name: RabbitUseraccountWrapper
 * Creater: wgicheru
 * Date:2/5/2020
 */
@Data
@AllArgsConstructor
public class UserDetailsDto {
    long userId;
    String email;
    String phoneNumber;
}
