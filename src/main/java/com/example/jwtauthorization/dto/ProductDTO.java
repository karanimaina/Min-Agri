package com.example.jwtauthorization.dto;

import lombok.Data;

@Data
public class ProductDTO {
    private String name;
    private String version;
    private Long productCategoryId;
    private Long productTypeId;
    private Double premiumRate;

}