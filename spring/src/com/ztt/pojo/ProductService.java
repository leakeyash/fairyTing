package com.ztt.pojo;

import org.springframework.stereotype.Component;

@Component("s")
public class ProductService {
    public void doSomeService(){
        System.out.println("doSomeService");
    }
}
