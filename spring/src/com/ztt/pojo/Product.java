package com.ztt.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
@Component("mmp")
public class Product {
    private String stupidHenry = "stupidHenry";
//    @Autowired
    @Resource(name="c")
    private Category category;
    public String getStupidHenry(){
        System.out.println(stupidHenry);
        return this.stupidHenry;
    }

    public void setStupidHenry(String stupidHenry){
        this.stupidHenry = stupidHenry;
    }

    public void setCategory(Category category){
        this.category = category;
    }

    public Category getCategory() {
        System.out.println("hehehe");
        return category;
    }
}
