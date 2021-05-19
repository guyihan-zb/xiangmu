package threadPool_0519;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-19
 * @time: 20:41
 */
public class demo49 {
    public static void main(String[] args) {
        //可以执行定时任务的线程池   2
        ScheduledExecutorService service = Executors.newScheduledThreadPool(10);

        System.out.println("执行任务之前"+ new Date());
        //执行任务

        service.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("执行任务"+ new Date());
            }
        },3, TimeUnit.SECONDS);

    }
}
