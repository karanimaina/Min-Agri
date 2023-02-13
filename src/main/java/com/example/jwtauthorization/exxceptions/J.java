package com.example.jwtauthorization.exxceptions;

public class FileInitializationFailure  extends  IllegalArgumentException{
    public FileInitializationFailure(String s) {
        super(s);
    }
}