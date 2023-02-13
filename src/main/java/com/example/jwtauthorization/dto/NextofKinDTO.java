package com.example.jwtauthorization.dto;

import lombok.Data;
/**
 * @author Felix Maina
 * @created 02/13/2023
 **/
@Data
public class NextofKinDTO {
    private Long userId;
    private String locationId;
    private String relationship;
    private String phoneNumber;
    private Long email;
    private String nationalIdNumber;
}
