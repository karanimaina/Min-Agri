package com.example.jwtauthorization.exxceptions;

public class ItemExistsException extends RuntimeException{
    public ItemExistsException(String message) {
        super (message);
    }
}