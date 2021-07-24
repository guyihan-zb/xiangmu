package com.example.usermanager.mapper;

import com.example.usermanager.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-07-24
 * @time: 00:59
 */
@Mapper
public interface UserMapper {

    public UserInfo login(String username,String password);

    public int add(UserInfo userInfo);

    public UserInfo getUser(int uid);

    public int update(UserInfo userInfo);
}
