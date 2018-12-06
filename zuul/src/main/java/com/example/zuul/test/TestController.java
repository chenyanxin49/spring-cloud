package com.example.zuul.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController
 *
 * @author :        ChenYanxin
 * @date :          2018/12/6 22:50
 */
@RestController
@RequestMapping("test")
public class TestController {

    private final MyTest test;

    @Autowired
    public TestController(MyTest test) {
        this.test = test;
    }

    @RequestMapping("/list")
    public String list() {
        return test.list();
    }
}
