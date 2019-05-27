package com.idv.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HsiController {
    @GetMapping("/Hello")
    public String hello(){
        return "Hello World";
    }
}
