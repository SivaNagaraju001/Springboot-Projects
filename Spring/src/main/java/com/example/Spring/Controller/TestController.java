package com.example.Spring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class TestController {
    @GetMapping
    public String testMethod(){
        return "Working Fine";
    }
}
