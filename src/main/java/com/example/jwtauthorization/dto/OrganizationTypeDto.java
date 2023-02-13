package com.example.jwtauthorization.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class OrganizationTypeDto {
    private String name;
    private String description;
    private long id;
}
