package com.example.jwtauthorization.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class UserWrapper {
    long userid;
    String name;
    String nationalid;
    String email;
    String phonenumber;
    List<UserPermissions> permissions = new ArrayList<>();

    boolean active;

    Date createdon;

}
