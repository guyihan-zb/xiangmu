package com.example.usermanager.model;

import lombok.Data;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-07-24
 * @time: 00:45
 */
@Data
public class UserInfo {
    private int id;
    private String name;
    private String username;
    private String password;
    private String sex;
    private int age;
    private String address;
    private String qq;
    private String email;
    private int isadmin;
}
