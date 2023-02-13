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
public class Subsidy extends BaseEntity {
    private String name;
    private Long productTypeId;
    private Long farmerCategoryId;
    private Double rate;


}
