package com.example.ordersys.controller;

import com.example.ordersys.mapper.DishMapper;
import com.example.ordersys.model.Dish;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.ordersys.tools.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-08-07
 * @time: 03:07
 */
@RestController
@RequestMapping("dish")
public class DishController {

    @Resource
    private DishMapper dishMapper;

    @RequestMapping("list")
    public ResponseBody<List<Dish>> getList(){
        List<Dish> data = dishMapper.getList();
        return new ResponseBody<>(0,"",data);
    }

    @RequestMapping("/add")
    public ResponseBody<Integer> add(Dish dish){
        int data = 0;
        data = dishMapper.add(dish);
        return new ResponseBody<>(0,"",data);
    }

    @RequestMapping("/del")
    public ResponseBody<Integer> del(int id){
        int data = dishMapper.del(id);
        return new ResponseBody<>(0,"",data);
    }
}
