package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-07-22
 * @time: 00:56
 */

@RequestMapping("/user")
public class UserController {

    @RequestMapping("/index")
    public String getIndex(){
        return null;
    }
}
