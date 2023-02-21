package com.smarthomestay.smarthomestay.repository;

import com.smarthomestay.smarthomestay.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer>  {
}
