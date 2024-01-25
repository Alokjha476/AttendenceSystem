package com.onlineattendance.system.controller;

import com.onlineattendance.system.entities.ImageData;
import com.onlineattendance.system.service.ImageDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/image")
public class ImageDataController {
    @Autowired
    private ImageDataService imageDataService;

    @PostMapping("/upload")
    public ResponseEntity<Object> uploadImage(@RequestParam("image") MultipartFile multipartFile) {

        ImageData response = null;
        try {
            if (!multipartFile.getContentType().equals("jpeg/image/png")) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .body("image should be jpeg/image/png only 1KB to 2MB");
            }
            if (multipartFile.isEmpty()) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("File is empty");
            }

            response = this.imageDataService.uploadImage(multipartFile);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error image not saved");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
        System.out.println("Image Saved");
        return ResponseEntity.status(HttpStatus.OK).body("Image successfully uploaded");
    }

//    public ResponseEntity<Object> getImageInfoByName(@PathVariable("name") String name) {
//        ImageData imageData = imageDataService.getByNameImage(name);
//        return ResponseEntity.status(HttpStatus.OK).body(imageData);
//
//    }
//
//    @GetMapping("/{name}")
//    public ResponseEntity<Object> getImageByName(@PathVariable("name") String name) {
//        byte[] imageData = imageDataService.getImage(name);
//        return ResponseEntity.status(HttpStatus.OK).body(imageData);
//
//
//    }
//

}
