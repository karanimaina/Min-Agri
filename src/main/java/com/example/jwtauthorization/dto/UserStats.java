package com.example.jwtauthorization.dto;

import lombok.Data;

@Data
public class UserStats {
    long registeredusers, activeusers, inactiveusers, newusers;
}
