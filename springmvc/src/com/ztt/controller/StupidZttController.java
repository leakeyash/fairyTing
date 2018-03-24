package com.ztt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/stupidZtt", method = RequestMethod.GET)
public class StupidZttController {
    @RequestMapping(value = "/getName", method = RequestMethod.GET)
    public String GetName(ModelMap model) {
        model.addAttribute("message", "Spring mvc StupidZttController");
        return "first";
    }
}