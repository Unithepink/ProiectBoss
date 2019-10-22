package com.diana.test.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SampleController {

    @RequestMapping("/greeting")
    public String hello() {
        return "HelloWorld!";
    }


    @RequestMapping ("/test")
    public String testGet(Model model) {
        model.addAttribute("message", "HELLO");
        return "offer";
    }






}
