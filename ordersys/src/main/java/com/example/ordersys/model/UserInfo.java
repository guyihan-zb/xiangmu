package com.example.ordersys.model;

import lombok.Data;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-07-31
 * @time: 14:46
 */
@Data
public class UserInfo {
    private int id;
    private String username;
    private String password;
    private int isadmin;
}
