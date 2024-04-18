package com.onlineattendance.system.controller;

import com.onlineattendance.system.entities.ImageData;
import com.onlineattendance.system.service.ImageDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

@RestController
@RequestMapping("/image")
public class ImageDataController {
    @Autowired
    private ImageDataService imageDataService;

    @PostMapping("/upload")
    public ResponseEntity<Object> attacheImage(@RequestParam("image") MultipartFile file) throws Exception {
        String uploadImage = imageDataService.uploadImage(file);
        return ResponseEntity.status(HttpStatus.OK).body("image uploaded");
    }

    @GetMapping("/{ImageInfoByName}")
    public ResponseEntity<Object> getImageInfoByName(@PathVariable("name") String name) {
        ImageData imageData = imageDataService.getByNameImage(name);
        return ResponseEntity.status(HttpStatus.OK).body(imageData);

    }

    @GetMapping("/{name}")
    public ResponseEntity<Object> getImageByName(@PathVariable("name") String name) {
        byte[] imageData = imageDataService.getImage(name);
        return ResponseEntity.status(HttpStatus.OK).body(imageData);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Object> deleteById(@RequestParam Long id) {
        imageDataService.deleteImage(id);
        return ResponseEntity.accepted().body("image deleted");
    }


}
