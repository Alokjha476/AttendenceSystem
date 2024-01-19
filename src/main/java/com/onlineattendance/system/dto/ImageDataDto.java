package com.onlineattendance.system.dto;

import lombok.Data;

@Data
public class ImageDataDto {
    private Long id;
    private String name;
    private String type;
    private byte[] imageData;
}
