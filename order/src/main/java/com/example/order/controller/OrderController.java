package com.example.order.controller;

import com.example.order.model.Person;
import com.example.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * HelloContreoller
 *
 * @author :        ChenYanxin
 * @date :          2018/12/2 22:49
 */
@RestController
@RequestMapping("order")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/get/{id}")
    public Person get(@PathVariable Integer id) {
        return orderService.getById(id);
    }

    @GetMapping("/list")
    public List<Person> list() {
        return orderService.listAll();
    }

    @PostMapping("/insert/{person}")
    public int insert(@PathVariable Person person) {
        return orderService.insert(person);
    }

    @PostMapping("/update/{person}")
    public int update(@PathVariable Person person) {
        return orderService.updateById(person);
    }

    @GetMapping("/delete/{id}")
    public int delete(@PathVariable Integer id) {
        return orderService.deleteById(id);
    }

}
