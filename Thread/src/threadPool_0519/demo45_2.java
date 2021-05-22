package threadPool_0519;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-22
 * @time: 11:25
 */
public class demo45_2 {
    public static void main(String[] args) {

        // 创建固定个数的线程池
        ExecutorService service = Executors.newFixedThreadPool(1);
        // 定义任务
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("线程名：" +
                        Thread.currentThread().getName());
            }
        };
        // 执行任务
        service.execute(runnable);
        service.execute(runnable);
        service.execute(runnable);
        service.execute(runnable);
        service.execute(runnable);
        service.execute(runnable);
        service.execute(runnable);
        service.execute(runnable);
        service.execute(runnable);
        service.execute(runnable);
    }
}
