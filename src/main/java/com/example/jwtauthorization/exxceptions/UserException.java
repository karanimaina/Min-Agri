package com.example.jwtauthorization.exxceptions;
public class UserException extends RuntimeException{
    public UserException(String message) {
        super (message);
    }
}
