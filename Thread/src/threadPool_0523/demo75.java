package threadPool_0523;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-23
 * @time: 16:31
 */
public class demo75 {
    static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {

        //不可继承性
        threadLocal.set("java");

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                String res = threadLocal.get();
                System.out.println("结果："+res);
            }
        });
        t1.start();
    }
}
