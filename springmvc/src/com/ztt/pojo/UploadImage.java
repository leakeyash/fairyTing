package com.ztt.pojo;

import org.springframework.web.multipart.MultipartFile;

public class UploadImage {
    MultipartFile image;

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

}
