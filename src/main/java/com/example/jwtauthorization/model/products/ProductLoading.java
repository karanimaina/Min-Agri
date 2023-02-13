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
public class ProductLoading extends BaseEntity {
    private long productid;
    private String name;
    private Double rate;

}