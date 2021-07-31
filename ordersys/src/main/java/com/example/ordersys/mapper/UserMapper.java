package com.example.ordersys.mapper;

import com.example.ordersys.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-07-31
 * @time: 14:57
 */
@Mapper
public interface UserMapper {
    //注册
    public int register(UserInfo userInfo);

    public List<UserInfo> getUserList();
}
