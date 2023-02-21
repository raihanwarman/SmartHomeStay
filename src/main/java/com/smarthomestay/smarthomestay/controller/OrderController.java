package com.smarthomestay.smarthomestay.controller;

import com.smarthomestay.smarthomestay.entity.Order;
import com.smarthomestay.smarthomestay.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping("/addOrder")
    public Order addUser(@RequestBody Order order){
        return service.saveOrder(order);
    }

    @GetMapping("/orders")
    public List<Order> findAllOrders(){
        return service.getOrders();
    }

    @GetMapping("/order/{id}")
    public Order findOrderById(@PathVariable int id){
        return service.getOrderById(id);
    }
}
