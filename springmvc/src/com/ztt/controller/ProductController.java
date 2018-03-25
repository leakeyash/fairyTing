package com.ztt.controller;

import com.ztt.pojo.Category;
import com.ztt.pojo.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class ProductController {
    @RequestMapping("/addProduct")
    public ModelAndView add(Product product) throws Exception{
        ModelAndView modelAndView = new ModelAndView("showProduct");
        return modelAndView;
    }

    @RequestMapping("/addCatrgory")
    public ModelAndView addCatrgory(Category category) throws Exception{
        ModelAndView modelAndView = new ModelAndView("redirect:/addProduct");
        return modelAndView;
    }

    @RequestMapping("/check")
    public ModelAndView check(HttpSession session){
        Integer i = (Integer) session.getAttribute("count");
        if (i == null)
            i = 0;
        i++;
        session.setAttribute("count",i);
        ModelAndView modelAndView = new ModelAndView("check");
        return modelAndView;
    }

    @RequestMapping("/clear")
    public ModelAndView clear(HttpSession session){
        session.setAttribute("count",0);
        ModelAndView modelAndView = new ModelAndView("redirect:/check");
        return modelAndView;
    }
}
