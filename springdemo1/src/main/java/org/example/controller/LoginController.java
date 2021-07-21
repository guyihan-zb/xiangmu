package org.example.controller;

import lombok.Getter;
import org.example.model.User;
import org.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-07-20
 * @time: 15:07
 */

@Controller
@Getter
public class LoginController {


    //第一种注入的方式：属性注入
//    @Autowired
//    private LoginService loginService;

//    //第二种注入的方式，通过Set的方式注入
//    private LoginService loginService;
//
//    @Autowired
//    public void setLoginService(LoginService loginService) {
//        this.loginService = loginService;
//    }
//

    //第三种注入方式：构造函数注入
    private LoginService loginService;
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    public void sayHi(){
        //参数效验
        loginService.sayHi();
    }



    private User u1;
    @Autowired
    @Qualifier("user1")
    public void setU1(User u1){
        this.u1 = u1;
    }


    @Bean
    public User user1(){
        User user = new User();
        user.setName("悟空");
        user.setPassword("你这个呆子");
        return user;
    }

    @Bean
    public User user2(){
        User user = new User();
        user.setName("八戒");
        user.setPassword("咱们还是散了吧，我回我的高老庄");
        return user;
    }
}
