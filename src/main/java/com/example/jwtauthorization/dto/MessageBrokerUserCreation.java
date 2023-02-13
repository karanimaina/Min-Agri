package com.example.jwtauthorization.dto;

import lombok.Data;

import java.util.Date;

/**
 * Class name: RabbitUserCreation
 * Creater: wgicheru
 * Date:1/30/2020
 */
@Data
public class MessageBrokerUserCreation {
    private String firstname;
    private String othernames;
    private String email;
    private String phonenumber;
    private Date   dateofbirth;
    private  String gender;
    private String nationality;
    String nationalidnumber;
    String resourceid;
    String rolename;
}
