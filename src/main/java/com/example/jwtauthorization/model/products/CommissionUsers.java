package com.example.jwtauthorization.model.products;

import com.example.jwtauthorization.model.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CommissionUsers extends BaseEntity {
    private long userId;
    private Long commissionId;
}

