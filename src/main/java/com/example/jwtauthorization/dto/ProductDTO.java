package com.example.jwtauthorization.dto;

import lombok.Data;

@Data
public class ProductDTO {
    String name;
    String version;
    Long productCategoryId;
    Long productTypeId;
    Double premiumRate;

}