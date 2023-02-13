package com.example.jwtauthorization.dto;

import lombok.Data;

@Data
public class UserStats {
    private long registeredUsers, activeUsers, inactiveUsers, newUsers;
}
