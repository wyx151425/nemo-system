package com.rumofuture.nemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mvc")
public class MainController {

    @GetMapping(value = "/{pageName}")
    public String route(@PathVariable("pageName") String pageName) {
        return pageName;
    }
}
