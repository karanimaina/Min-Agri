package com.example.jwtauthorization.dto;

import lombok.Data;
/**
 * @author Felix Maina
 * @created 02/13/2023
 **/
@Data
public class CommissionDto {
    private  String name;
    private Long financialItemId;
    private Double rate;
}
