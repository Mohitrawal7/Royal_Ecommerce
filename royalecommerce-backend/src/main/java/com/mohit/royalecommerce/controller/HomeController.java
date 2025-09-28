package com.mohit.royalecommerce.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

 @RequestMapping("/")
// @ResponseBody
    public String greet(){
        return "Welcome to world";
    }

    @RequestMapping("/about")
    public String about(){
     return "deal are done to be done";
    }
}
