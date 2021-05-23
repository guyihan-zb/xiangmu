package threadPool_0523;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-23
 * @time: 10:04
 */
public class demo59 {
    public static void main(String[] args) {

        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(5,5,0,
                        TimeUnit.SECONDS,new LinkedBlockingDeque<>(5),new ThreadPoolExecutor.CallerRunsPolicy());
       // ThreadPoolExecutor.AbortPolicy  默认的拒绝策略
       // ThreadPoolExecutor.DiscardOldestPolicy 忽略新任务  10
       // ThreadPoolExecutor.DiscardPolicy  忽略老任务  5
        for (int i = 0; i <11 ; i++) {
            int fin = i;
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("任务:"+fin +",线程名："+Thread.currentThread().getName());
                }
            });
        }
    }
}
