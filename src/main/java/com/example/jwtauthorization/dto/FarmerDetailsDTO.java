package com.example.jwtauthorization.dto;

import lombok.Data;

@Data
public class FarmerDetailsDTO {
    private Long userId;
    private String locationId;
    private String maritalStatus;
    private String photo;
    private Long fieldAgentId;
    private String needVerification;
    private String rlmaVerification;
    private String bankName;
    private String branch;
    private String accountName;
    private String accountNumber;
}
