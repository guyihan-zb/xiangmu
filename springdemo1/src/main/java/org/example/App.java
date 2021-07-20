package org.example;

import javafx.application.Application;
import org.example.controller.LoginController;
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

        //LoginController loginController = (LoginController) context.getBean("loginController");

        LoginController loginController = context.getBean(LoginController.class);

        System.out.println(loginController);
        //关闭容器
        ((ClassPathXmlApplicationContext)context).close();
    }
}
