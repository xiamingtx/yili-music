package com.bilitech.yilimusic.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 夏明
 * @version 1.0
 */
@RestController
@RequestMapping("/hello")
@CrossOrigin
public class DefaultController {

    @GetMapping
    public String sayHello() {
        return "欢迎访问伊利音乐盒";
    }
}
