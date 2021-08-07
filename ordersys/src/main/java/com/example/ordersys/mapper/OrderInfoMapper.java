package com.example.ordersys.mapper;

import com.example.ordersys.model.OrderInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-08-07
 * @time: 18:02
 */
@Mapper
public interface OrderInfoMapper {
    public int add(OrderInfo orderInfo);

    public List<OrderInfo> getAllList();

    public int up(int oid, int status);

    public List<OrderInfo> getList(int uid);
}
