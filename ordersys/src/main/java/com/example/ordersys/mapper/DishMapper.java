package com.example.ordersys.mapper;

import com.example.ordersys.model.Dish;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-08-07
 * @time: 03:13
 */
@Mapper
public interface DishMapper {

    public List<Dish> getList();
}
