package threadPool_0523;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-23
 * @time: 11:11
 */
public class demo63 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(10,10,0,
                        TimeUnit.SECONDS,new LinkedBlockingQueue<>(1000));

        for (int i = 0; i < 10; i++) {
            int fin = i;
            executor.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(String.format("编号：%d，线程名：%s",
                            fin,Thread.currentThread().getName()));
                }
            });
        }
//        executor.shutdown();
        executor.shutdownNow();
    }
}
