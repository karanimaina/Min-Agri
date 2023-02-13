package com.example.jwtauthorization.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.minagri.app.entities.FarmerDetails;
import com.minagri.app.entities.users.AppUser;
import lombok.Data;

import java.util.Date;

@Data
public class FarmerDTO {
    Long userid;
    String locationid;
    String maritalstatus;
    String photo;
    Long fieldagentid;
    String nidaverification;
    String rlmaverification;
    String bankname;
    String branch;
    String accountname;
    String accountnumber;

    private String name;
    private String email;
    private String phonenumber;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dateofbirth;
    private String gender;
    private String nationality;
    private String nationalidnumber;

    private boolean active;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date registrationdate;

    public FarmerDTO(FarmerDetails farmerDetails, AppUser users){
        this.userid=users.getUserid();

        this.locationid=farmerDetails.getLocationid();
        this.maritalstatus=farmerDetails.getMaritalstatus();
        this.photo=farmerDetails.getPhoto();
        this.fieldagentid= farmerDetails.getFieldagentid();
        this.nidaverification=farmerDetails.getNidaverification();
        this.rlmaverification=farmerDetails.getRlmaverification();
        this.bankname=farmerDetails.getBankname();
        this.branch=farmerDetails.getBranch();
        this.accountname=farmerDetails.getAccountname();
        this.accountnumber=farmerDetails.getAccountnumber();

        this.name=users.getName();
        this.email=users.getEmail();
        this.phonenumber=users.getPhonenumber();
        this.dateofbirth=users.getDateofbirth();
        this.gender=users.getGender();
        this.nationality=users.getNationality();
        this.nationalidnumber=users.getNationalidnumber();
        this.active=users.isActive();
        this.registrationdate=users.getRegistrationdate();
    }
}
