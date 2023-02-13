package com.example.jwtauthorization.dto;

import lombok.Data;

@Data
public class SaleDTO {
    private Long farmerUserId;
    private Long productId;
    private Long farmId;

    private Double coverValue;
    private Double subsidyValue;
    private Double actualPay;
}
