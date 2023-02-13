package com.example.jwtauthorization.model.products;

import com.example.jwtauthorization.model.BaseEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductSales extends BaseEntity {
    private Long farmerUserId;
    private Long productId;
    private Long farmId;
    private Double coverValue;
    private Double subsidyValue;
    private Double actualPay;
}
