package com.ztt.controller;

import com.ztt.pojo.UploadImage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
public class UploadController {
    @RequestMapping("/uploadImage")
    public ModelAndView upload(HttpServletRequest request, UploadImage uploadImage)throws IllegalStateException, IOException {

        String name = randomAlphanumeric(10)+getExtensionName(uploadImage.getImage().getOriginalFilename());
        File newFile = new File(request.getServletContext().getRealPath("/image"),name);
        newFile.getParentFile().mkdirs();
        uploadImage.getImage().transferTo(newFile);

        ModelAndView modelAndView = new ModelAndView("showUploadFile");
        modelAndView.addObject("imageName",name);
        return modelAndView;
    }
    private String randomAlphanumeric(Integer number){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<number;i++){
            sb.append((char)(int)(Math.random()*26+97));
        }
        return sb.toString();
    }
    private String getExtensionName(String fileName){
        Integer index= fileName.lastIndexOf('.');
        return fileName.substring(index);
    }
}
