package threadPool_0523;

import java.util.concurrent.*;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-23
 * @time: 10:14
 */
public class demo60 {
    public static void main(String[] args) {

        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(5, 5, 0,
                        TimeUnit.SECONDS, new LinkedBlockingQueue<>(5), new RejectedExecutionHandler() {
                    @Override
                    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                        //自定义拒绝策略
                        System.out.println("执行了自定义拒绝策略");
                    }
                });

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
