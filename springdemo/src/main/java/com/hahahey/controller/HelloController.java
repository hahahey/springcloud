package com.hahahey.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author locks
 * @date 2022-04-19 16:10
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String getHello(){
        return "hello";
    }
}
