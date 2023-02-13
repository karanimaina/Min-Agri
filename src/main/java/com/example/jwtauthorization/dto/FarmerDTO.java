package com.example.jwtauthorization.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class FarmerDTO {
    private  Long userid;
    private String locationId;
    private String maritalstatus;
    private String photo;
    private Long fieldagentid;
    private String nidaverification;
    private String rlmaverification;
    private String bankname;
    private String branch;
    private String accountname;
    private  String accountnumber;

    private String name;
    private String email;
    private String phoneNumber;

    private Date dateOfBirth;
    private String gender;
    private String nationality;
    private String nationalIdNumber;

    private boolean active;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date registrationdate;}


