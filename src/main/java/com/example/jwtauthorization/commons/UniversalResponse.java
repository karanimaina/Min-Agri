package com.example.jwtauthorization.commons;

import lombok.Builder;
import lombok.Data;

/**
 * @author Alex Maina
 * @created 26/10/2022
 **/
@Data
@Builder
public class UniversalResponse {
    private int status;
    private String message;
    private Object data;
}
