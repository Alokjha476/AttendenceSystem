package com.onlineattendance.system.service;

import com.onlineattendance.system.entities.ImageData;
import com.onlineattendance.system.repositories.ImageDataRepository;
import com.onlineattendance.system.util.ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.Optional;

@Service
public class ImageDataService {
    @Autowired
    private ImageDataRepository imageDataRepository;

    //Upload Image
    public String uploadImage(MultipartFile image) throws Exception {
        imageDataRepository.save(ImageData.builder().
                name(image.getOriginalFilename()).
                type(image.getContentType()).
                imageData(ImageUtil.compressImage(image.getBytes())).
                build());

        return "Image uploaded " + image.getOriginalFilename();
    }
    // Get by name Image
    @Transactional
    public ImageData getByNameImage(String name) {
        Optional<ImageData> dbImage = imageDataRepository.findByName(name);
        return ImageData.builder().name(dbImage.get().getName()).type(dbImage.get().getName()).imageData(ImageUtil.compressImage(dbImage.get().getImageData())).build();
    }
    // Get Image
    @Transactional
    public byte[] getImage(String name) {
        Optional<ImageData> dbImage = imageDataRepository.findByName(name);
        return ImageUtil.compressImage(dbImage.get().getImageData());
    }
    public void deleteImage(Long id) {
        imageDataRepository.deleteById(id);
    }
}

