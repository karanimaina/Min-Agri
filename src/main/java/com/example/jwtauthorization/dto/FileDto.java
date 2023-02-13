package com.example.jwtauthorization.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
@Data
public class FileDto{
    private MultipartFile multipartFile;
    private long contractId;
    private  String createdBy;
}
