package com.example.ordersys.controller;

import com.example.ordersys.mapper.UserMapper;
import com.example.ordersys.model.UserInfo;
import com.example.ordersys.tools.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.*;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-07-31
 * @time: 14:52
 */
@RestController
@RequestMapping("/user")
public class UserInfoController {

    @Resource
    private UserMapper userMapper;

    //用户注册
    @RequestMapping("/reg")
    public ResponseBody<Integer> register(UserInfo userInfo){
        int data = userMapper.register(userInfo);
        return new ResponseBody<>(0,"",data);
    }

    /*
    * 查询所有用户列表
    * */
    public ResponseBody<List<UserInfo>> getUserList(){
        List<UserInfo> data = new ArrayList<>();
        data = userMapper.getUserList();
        return new ResponseBody<>(0,"",data);
    }
}
