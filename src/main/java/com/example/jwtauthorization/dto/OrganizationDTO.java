package com.example.jwtauthorization.dto;

import lombok.Data;

@Data
public class OrganizationDTO {
    private String name;
    private Long orgType;
    private Long locationId;
    private String website;
    private String email;
    private String phoneNumber;
    private String registrationNumber;
    private String licenseNumber;
    private Long contactUserId;
    private long id;
}
