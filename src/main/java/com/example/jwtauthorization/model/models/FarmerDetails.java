package com.example.jwtauthorization.model.models;

import com.example.jwtauthorization.model.BaseEntity;
import jakarta.persistence.Column;

public class FarmerDetails extends BaseEntity {
    private Long userId;
    private String locationId;
    private String maritalStatus;
    private String photo;
    private Long   fieldAgentId;
    private String nidaVerification;
    private String rlmaVerification;
    private String bankName;
    private String branch;
    @Column(unique = true,updatable = false)
    private String accountName;
    private String accountNumber;


}
