package com.example.jwtauthorization.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data @JsonIgnoreProperties(ignoreUnknown = true) @JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {
    String name;
    String nationalId;
    String email;
    String phoneNumber;

    Long organizationId;
}
