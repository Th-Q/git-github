package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TH
 * @version 1.0
 * @date 2021/5/11
 */
@RestController
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "rest";
    }
}
