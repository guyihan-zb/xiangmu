package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-07-22
 * @time: 00:56
 */

@RequestMapping("/user")
@Controller
public class UserController {

    //创建一个当前类日志对象
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/sayHi")
    @ResponseBody
    public String getIndex(String name){
        if(name==null||name.equals("")){
            logger.error("我的日志信息：级别：error");
        }
        logger.warn("我的日志信息：级别：warn");
        logger.info("我的日志信息：级别：info");
        logger.trace("我的日志信息：级别：trace");
        logger.debug("我的日志信息：级别：debug");
        return "你好";
    }
}
