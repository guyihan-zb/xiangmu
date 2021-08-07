package com.example.ordersys.mapper;

import org.apache.ibatis.annotations.Mapper;

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

}
