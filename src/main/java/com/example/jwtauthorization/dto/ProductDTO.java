package com.example.jwtauthorization.dto;

import lombok.Data;

@Data
public class ProductDTO {
    String name;
    String version;
    Long productcategoryid;
    Long producttypeid;
    Double premiumrate;

}