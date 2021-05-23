package threadPool_0523;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-23
 * @time: 09:24
 */
public class demo55 {
    public static void main(String[] args) {

        //原始创建方式
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(5,10,
                        60, TimeUnit.SECONDS,
                        new LinkedBlockingQueue<>(1000));
        for (int i = 0; i < 2; i++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程名："+Thread.currentThread().getName());
                }
            });
        }

    }
}
