package com.example.jwtauthorization.dto;

import lombok.Data;

@Data
public class ProductLoadingDto {
    private long productId;
    private String name;
    private Double rate;
}
