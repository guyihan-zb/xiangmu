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
 * @time: 20:45
 */
public class demo50 {
    public static void main(String[] args) {
        //可以执行定时任务的线程池   3
        ScheduledExecutorService service = Executors.newScheduledThreadPool(10);

        System.out.println("执行任务之前"+ new Date());
        //执行任务

        service.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("执行任务"+ new Date());
            }
        },1,3, TimeUnit.SECONDS);

    }
}
