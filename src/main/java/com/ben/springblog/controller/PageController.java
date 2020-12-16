package com.ben.springblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/demo")
    public String ShowDemo()
    {
        return "redirect:/demo1.html";
    }
}
