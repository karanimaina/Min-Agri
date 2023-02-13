package com.example.jwtauthorization.dto;

import lombok.Data;

@Data
public class NextofKinDTO {
    Long userid;
    String locationid;
    String relationship;
    String phonenumber;
    Long email;
    String nationalidnumber;
}
