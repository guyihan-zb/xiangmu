package com.example.ordersys.tools;

import lombok.Data;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-07-31
 * @time: 14:54
 */
@Data
public class ResponseBody<T> {
    private int status;
    private String msg;
    private T data;
    public ResponseBody(int status,String msg,T data){
        this.data = data;
        this.status = status;
        this.msg = msg;
    }
}
