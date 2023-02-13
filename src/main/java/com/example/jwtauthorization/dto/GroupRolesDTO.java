package com.example.jwtauthorization.dto;

import lombok.Data;

@Data
public class GroupRolesDTO {
    private Long groupid;
    private Long[] roleid;

}
