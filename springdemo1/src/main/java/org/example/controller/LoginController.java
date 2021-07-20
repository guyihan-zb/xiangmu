package org.example.controller;

import lombok.Getter;
import org.example.model.User;
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
