package com.ztt.controller;


import org.springframework.web.servlet.mvc.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.lang.annotation.Annotation;

//@Controller
//@RequestMapping(value="/ztt",method= RequestMethod.GET)
//public class ZttController {
//    @RequestMapping(value="/getName",method= RequestMethod.GET)
//    public String GetName(ModelMap model){
//        model.addAttribute("msg","Spring mvc Hello World");
//        model.addAttribute("name","ztt");
//        return "first";
//    }
//}
public class ZttController implements Controller {
    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mav = new ModelAndView("first");
        mav.addObject("message", "Hello Spring MVC");
        return mav;
    }

}