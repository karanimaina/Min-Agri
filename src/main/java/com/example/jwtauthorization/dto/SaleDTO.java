package com.example.jwtauthorization.dto;

import lombok.Data;

@Data
public class SaleDTO {
    Long farmeruserid;
    Long productid;
    Long farmid;

    Double covervalue;
    Double subsidyvalue;
    Double actualpay;
}
