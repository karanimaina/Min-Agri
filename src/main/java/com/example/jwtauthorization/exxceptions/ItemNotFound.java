package com.example.jwtauthorization.exxceptions;

public class ItemNotFound extends  RuntimeException{
    public ItemNotFound(String message) {
        super (message);
    }
}
