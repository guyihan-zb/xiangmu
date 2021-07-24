package com.example.usermanager.mapper;

import com.example.usermanager.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

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

    //查询一页信息
    public List<UserInfo> getListByPage(String name,String address,String email
            ,int skipCount,int psize,
             Integer isadmin);

    //铲鲟满足条件的条数
    public int getCount(String name,String address,String email,Integer isadmin);

    public int del(int id, Integer isadmin);

}
