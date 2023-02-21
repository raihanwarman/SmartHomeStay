package com.smarthomestay.smarthomestay.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ORDER")
public class Order {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer user_id;
    private Integer room_id;
    private Integer addOn_id;
    private Integer total_price;
    private LocalDate booking_schedule;

}
