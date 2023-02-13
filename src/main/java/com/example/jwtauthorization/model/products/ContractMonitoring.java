package com.example.jwtauthorization.model.products;

import com.example.jwtauthorization.model.BaseEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class ContractMonitoring extends BaseEntity {
    private Long productId;
    private Date startDate;
    private Date endDate;
    private String name;
    private String contractType;
    private String fileLocation;
}
