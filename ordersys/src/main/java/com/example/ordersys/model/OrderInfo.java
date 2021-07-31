package com.example.ordersys.model;

import lombok.Data;

import java.util.Date;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-07-31
 * @time: 14:47
 */
@Data
public class OrderInfo {
    private int id;
    private int uid;
    private Date createtime;
    private int status;
}
