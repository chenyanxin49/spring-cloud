package com.example.zuul.test;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * MyTest
 *
 * @author :        ChenYanxin
 * @date :          2018/12/6 22:42
 */
@FeignClient(value = "order")
public interface MyTest {

    /**
     * test
     *
     * @return test
     */
    @RequestMapping("/order/list")
    String list();
}
