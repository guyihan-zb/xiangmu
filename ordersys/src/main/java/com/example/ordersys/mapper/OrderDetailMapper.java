package com.example.ordersys.mapper;

import com.example.ordersys.model.OrderDetail;
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
public interface OrderDetailMapper {
    public int add(int oid,String[] dids);


    public List<OrderDetail> getList(int oid);


}
