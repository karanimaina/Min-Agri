package com.example.jwtauthorization.dto;

import lombok.Data;

@Data
public class SubsidyDTO {
    String name;
    Long producttypeid;
    Long farmercategoryid;
    Double rate;
}
