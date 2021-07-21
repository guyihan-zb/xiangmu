package org.example;

import javafx.application.Application;
import org.example.config.MyApplication;
import org.example.controller.LoginController;
import org.example.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-07-20
 * @time: 15:00
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        LoginController loginController = context.getBean(LoginController.class);
        loginController.sayHi();

//        MyApplication myApplication = context.getBean(MyApplication.class);
//        System.out.println(myApplication);

//        User user = (User) context.getBean("user1");
//        System.out.println(user);
//
//        //LoginController loginController = context.getBean(LoginController.class);
//
//        User user2 = context.getBean("user2",User.class);
//        System.out.println(user2);
        //LoginController loginController = (LoginController) context.getBean("loginController");

//        LoginController loginController = context.getBean(LoginController.class);
//
//        System.out.println(loginController);
        //关闭容器
        ((ClassPathXmlApplicationContext)context).close();
    }
}
