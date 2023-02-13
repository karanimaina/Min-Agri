package com.example.jwtauthorization.dto;

import lombok.Data;

@Data
public class SaleDTO {
    Long farmerUserId;
    Long productId;
    Long farmId;

    Double coverValue;
    Double subsidyValue;
    Double actualPay;
}
