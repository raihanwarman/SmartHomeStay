package com.smarthomestay.smarthomestay.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ADDONN")
public class AddOnn {
    @Id
    @GeneratedValue
    private Integer id;
    private String addOn_Name;
    private Integer addOn_price;

}
