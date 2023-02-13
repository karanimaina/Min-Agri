package com.example.jwtauthorization.dto;

import lombok.Data;

import java.util.Date;
@Data
public class ContractMonitoringDto {
    private long productId;
    private Date startDate;
    private Date endDate;
    private String name;
    private String type;
    private String createdBy;
}
