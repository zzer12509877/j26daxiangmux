package com.example.springsecturitydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebContr {

    @RequestMapping("login")
    public String  s(){
        return "login";
    }
}
