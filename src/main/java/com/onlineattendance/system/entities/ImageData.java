package com.onlineattendance.system.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImageData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String name;
    private String type;
    @Lob
    @Column(columnDefinition= "Longblob")
    private byte[] imageData;
    public ImageData(String s) {
    }
}
