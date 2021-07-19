package com.example.mavendemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chengshanqing
 * @date Created in 2021/07/19 16:43
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "Hello World";
    }
}
