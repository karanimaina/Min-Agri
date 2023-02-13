package com.example.jwtauthorization.dto;

import lombok.Data;

@Data
public class SubsidyDTO {
   private String name;
    private Long producttypeid;
    private Long farmerCategoryId;
    private Double rate;
}
