package com.example.test91.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zwd
 * @desc
 * @date 2020/8/31
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "test2";
    }
}
