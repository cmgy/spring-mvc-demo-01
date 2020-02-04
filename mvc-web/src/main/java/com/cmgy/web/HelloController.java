package com.cmgy.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: chenhao
 * @time: 2020/2/4 14:29
 */
@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping("click")
    public String printHello() {
        System.out.println("Hello world");
        return "hello";
    }
}
