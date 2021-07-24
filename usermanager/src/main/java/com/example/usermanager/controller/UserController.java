package com.example.usermanager.controller;

import com.example.usermanager.mapper.UserMapper;
import com.example.usermanager.model.UserInfo;
import com.example.usermanager.tools.AppFinal;
import com.example.usermanager.tools.ResponseBody;
import com.example.usermanager.tools.SessionUtil;
import com.sun.corba.se.spi.servicecontext.UEInfoServiceContext;
import com.sun.java.swing.plaf.motif.MotifPasswordFieldUI;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.crypto.Data;
import java.util.HashMap;
import java.util.List;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-07-24
 * @time: 00:56
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserMapper userMapper;

    //登陆方法
    @RequestMapping("/login")
    public ResponseBody<UserInfo> login(@RequestParam String username,
                              @RequestParam String password,
                                        HttpServletRequest request){
        UserInfo userInfo = userMapper.login(username,password);
        int status = -1;
        String message = "用户名或密码错误!";
        if(userInfo!=null && userInfo.getId()>0){
            //登陆成功
            status = 0;
            message = "";
            //将用户对象存储到session中
            HttpSession session = request.getSession();
            session.setAttribute(AppFinal.USERINFO_SESSION_KEY,userInfo);
        }
        return new ResponseBody<>(status,message,userInfo);
    }
    // 设置当前登录用户的权限
    @RequestMapping("/checkadmin")
    public ResponseBody<Integer> checkAdmin(HttpServletRequest request){
        int data = 0;
        HttpSession session = request.getSession(false);
        UserInfo userInfo = null;
        if(session != null &&
                (userInfo=(UserInfo)session.getAttribute(AppFinal.USERINFO_SESSION_KEY))!=null){
            data = userInfo.getIsadmin();
        }
        return new ResponseBody<>(0,"",data);
    }

    //添加用户方法
    @RequestMapping("/add")
    public ResponseBody<Integer> add(UserInfo userInfo,HttpServletRequest request){
        int data = 0;
        int status = 0;
        String message = "";
        //安全效验
        UserInfo user = SessionUtil.getUserBySession(request);
        if(user==null) {
            //未登录
            status = -1;
            message = "当前用户未登录,请先登录";
        }else if(userInfo.getIsadmin()==1){//要添加超级管理员
            if(user.getIsadmin()==0){
                status = -2;
                message="当前用户权限不足，不能操作";
            }else if(user.getIsadmin()==1){
                data = userMapper.add(userInfo);
                status = 0;
            }
        }else if (userInfo.getIsadmin()==0) {
            //添加一个普通管理员
            data = userMapper.add(userInfo);
        }
        return new ResponseBody<>(status,message,data);
    }

    @RequestMapping("/getuser")
    public ResponseBody<UserInfo> getUser(@RequestParam int uid){
        int status = -1;
        String message = "未知错误";
        UserInfo userInfo = userMapper.getUser(uid);
        if(userInfo!=null){
            //todo:权限效验
            status = 0;
        }
        return new ResponseBody<>(status,message,userInfo);
    }

    @RequestMapping("/update")
    public ResponseBody<Integer> update(UserInfo userInfo){
        int data = 0;
        //todo:权限效验
        data = userMapper.update(userInfo);
        return new ResponseBody<>(0,"",data);
    }


    @RequestMapping("/list")
    public ResponseBody<HashMap<String,Object>> getList(String name,String address,String email,
                                                        int cpage,int psize,HttpServletRequest request){
        //权限效验
        UserInfo userInfo = SessionUtil.getUserBySession(request);
        if(userInfo == null){
            return new ResponseBody<>(-1,"当前用户未登录",null);
        }
        Integer isadmin = null;
        if(userInfo.getIsadmin()==0){
            isadmin = 0;
        }
        name = name.equals("")?null:name;
        address = address.equals("")?null:address;
        email = email.equals("")?null:email;

        //跳过查询的条数
        int skipCount = (cpage-1)*psize;
        List<UserInfo> list = userMapper.getListByPage(name,address,email,skipCount,psize,isadmin);

        //查询满足条件的条数
        int tcount = userMapper.getCount(name,address,email,isadmin);

        //总页数
        int tpage = (int) Math.ceil(tcount/(psize*1.0));

        HashMap<String,Object> data = new HashMap<>();
        data.put("list",list);
        data.put("tcount",tcount);
        data.put("tpage",tpage);

        return new ResponseBody<>(0,"",data);
    }

    @RequestMapping("/del")
    public ResponseBody<Integer> del(@RequestParam int id,HttpServletRequest request){
        //todo:权限效验
        UserInfo userInfo = SessionUtil.getUserBySession(request);
        if(userInfo == null){
            return new ResponseBody<>(-1,"未登录",0);
        }
        //判断删除的是否是自己
        if(id==userInfo.getId()){
            //删除的是自己
            return new ResponseBody<>(-2,"不能删除自己",0);
        }
        Integer isadmin = null;
        if(userInfo.getIsadmin() == 0){
            isadmin = 0;
        }
        int result = userMapper.del(id,isadmin);
        return new ResponseBody<>(0,"",result);
    }
}
