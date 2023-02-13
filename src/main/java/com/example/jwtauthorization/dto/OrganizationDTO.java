package com.example.jwtauthorization.dto;

import lombok.Data;

@Data
public class OrganizationDTO {
    private String name;
    private Long orgtype;
    private Long locationid;
    private String website;
    private String email;
    private String phonenumber;
    private String registrationnumber;
    private String licensenumber;
    private Long contactuserid;
    private long id;
}
