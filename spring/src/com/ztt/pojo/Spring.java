package com.ztt.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });

//        Category c = (Category) context.getBean("c");
//
//        System.out.println(c.getName());
//
        Product mmp = (Product) context.getBean("mmp");
//
        mmp.getCategory().getName();
        mmp.getStupidHenry();
//        System.out.println(mmp.getCategory().getName());

        ProductService s = (ProductService) context.getBean("s");
        s.doSomeService();
    }
}
