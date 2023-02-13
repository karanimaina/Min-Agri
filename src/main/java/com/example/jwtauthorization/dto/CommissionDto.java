package com.example.jwtauthorization.dto;

import lombok.Data;

@Data
public class CommissionDto {
    String name;
    Long financialItemId;
    Double rate;
}
