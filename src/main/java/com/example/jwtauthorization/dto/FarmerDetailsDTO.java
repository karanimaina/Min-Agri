package com.example.jwtauthorization.dto;

import lombok.Data;

@Data
public class FarmerDetailsDTO {
    private Long userId;
    private String locationId;
    private String maritalStatus;
    private String photo;
    private Long fieldAgentId;
    private String nidAverification;
    private String rlmaverification;
    private String bankname;
    private String branch;
    private String accountname;
    private String accountnumber;
}
