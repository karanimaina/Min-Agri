package com.example.jwtauthorization.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class ResponseWrapper {

    String status;
    String message;
    Object body;

    public ResponseWrapper(String status,String message){
        this.status=status;
        this.message=message;
    }
}
