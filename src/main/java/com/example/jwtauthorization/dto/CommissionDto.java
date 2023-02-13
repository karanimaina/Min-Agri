package com.example.jwtauthorization.dto;

import lombok.Data;

@Data
public class CommissionDto {
    private  String name;
    private Long financialItemId;
    private Double rate;
}
