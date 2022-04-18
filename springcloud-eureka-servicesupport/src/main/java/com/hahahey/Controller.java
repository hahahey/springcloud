package com.hahahey;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author locks
 * @date 2022-02-12 12:17
 */
@RestController
@RequestMapping("/hello")
public class Controller {
    @RequestMapping("/world")
    public String helloWorld(String s) {
        System.out.println("传入的值为：" + s);
        return "传入的值为：" + s;
    }
}
