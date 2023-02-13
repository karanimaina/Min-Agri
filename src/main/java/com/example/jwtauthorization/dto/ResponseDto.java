package com.example.jwtauthorization.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ResponseDto {

    private String status;
    private String message;
    private Object body;


}
