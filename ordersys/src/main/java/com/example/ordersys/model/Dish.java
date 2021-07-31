package com.example.ordersys.model;

import lombok.Data;

import java.math.BigDecimal;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-07-31
 * @time: 14:49
 */
@Data
public class Dish {
    private int id;
    private String name;
    private BigDecimal price;
}
