package com.example.jwtauthorization.dto;

import lombok.Data;

/**
 * @author Alex Maina
 * @created 27/10/2022
 **/
@Data
public class PageableDto {
    private long id;
    private int size;
    private int page;
}
