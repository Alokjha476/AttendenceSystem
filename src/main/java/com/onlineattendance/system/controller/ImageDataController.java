package com.onlineattendance.system.controller;

import com.onlineattendance.system.entities.ImageData;
import com.onlineattendance.system.service.ImageDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/image")
public class ImageDataController {
    @Autowired
    private ImageDataService imageDataService;

    @PostMapping
    public ResponseEntity<Object> uploadImage(@RequestParam("image") MultipartFile multipartFile) throws Exception {
        ImageData response = imageDataService.uploadImage(multipartFile);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @GetMapping("/info/{name}")
    public ResponseEntity<Object> getImageInfoByName(@PathVariable("name") String name) {
        ImageData imageData = imageDataService.getByNameImage(name);
        return ResponseEntity.status(HttpStatus.OK).body(imageData);

    }

    @GetMapping("/{name}")
    public ResponseEntity<Object> getImageByName(@PathVariable("name") String name) {
        byte[] imageData = imageDataService.getImage(name);
        return ResponseEntity.status(HttpStatus.OK).body(imageData);


    }


}
