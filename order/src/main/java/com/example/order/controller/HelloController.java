package com.example.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloContreoller
 *
 * @author :        ChenYanxin
 * @date :          2018/12/2 22:49
 */
@RestController
public class HelloController {

    @GetMapping("/hello/{name}")
    public String index(@PathVariable String name) {
        return "hello " + name + "，this is first messge";
    }
}
