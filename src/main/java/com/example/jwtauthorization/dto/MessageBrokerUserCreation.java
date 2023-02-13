package com.example.jwtauthorization.dto;

import lombok.Data;

import java.util.Date;
/**
 * @author Felix Maina
 * @created 02/13/2023
 **/

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
