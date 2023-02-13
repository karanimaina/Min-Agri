package com.example.jwtauthorization.dto;

import lombok.Data;

import java.util.Optional;

@Data
public class ContactWrapper {

    public ContactWrapper(){
        this.email = Optional.empty();
        this.phonenumber = Optional.empty();

    }

    Optional<String> email;
    Optional<String> phonenumber;
}
