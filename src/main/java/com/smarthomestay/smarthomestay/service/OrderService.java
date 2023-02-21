package com.smarthomestay.smarthomestay.service;

import com.smarthomestay.smarthomestay.entity.Order;
import com.smarthomestay.smarthomestay.entity.User;
import com.smarthomestay.smarthomestay.repository.OrderRepository;
import com.smarthomestay.smarthomestay.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class OrderService {
    @Autowired
    private OrderRepository repository;

    public Order saveOrder(Order order){
        return repository.save(order);
    }

    public List<Order> getOrders(){
        return repository.findAll();
    }

    public Order getOrderById(Integer id){
        return repository.findById(id).orElse(null);
    }
}
