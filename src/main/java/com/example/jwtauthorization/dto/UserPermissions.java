package com.example.jwtauthorization.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserPermissions {
   private String groupname;
   private List roles;
}
