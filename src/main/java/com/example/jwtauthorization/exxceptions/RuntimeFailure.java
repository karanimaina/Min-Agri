package com.example.jwtauthorization.exxceptions;

public class RuntimeFailure extends IllegalArgumentException {
    public RuntimeFailure(String s) {
        super(s);
    }
}
