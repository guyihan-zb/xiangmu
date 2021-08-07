package com.example.ordersys.controller;

import com.example.ordersys.mapper.OrderDetailMapper;
import com.example.ordersys.model.OrderDetail;
import com.example.ordersys.tools.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-08-07
 * @time: 22:30
 */
@RestController
@RequestMapping("/detail")
public class OrderDetailController {

    @Resource
    private OrderDetailMapper orderDetailMapper;

    @RequestMapping("/list")
    public ResponseBody<List<OrderDetail>> getList(int oid){
        List<OrderDetail> list = orderDetailMapper.getList(oid);
        return new ResponseBody<>(0,"",list);
    }

}
