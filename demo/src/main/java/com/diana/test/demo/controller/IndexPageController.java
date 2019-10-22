package com.diana.test.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class IndexPageController {



    @RequestMapping(method = RequestMethod.GET, value = "/fuck")
    public String index() {
        return "product.html";
    }



}
