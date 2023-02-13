package com.example.jwtauthorization.dto;

import lombok.Data;

@Data
public class FarmerDetailsDTO {
    private Long userid;
    private String locationid;
    private String maritalstatus;
    private String photo;
    private Long fieldagentid;
    private String nidaverification;
    private String rlmaverification;
    private String bankname;
    private String branch;
    private String accountname;
    private String accountnumber;
}
