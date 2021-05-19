package threadPool_0519;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-19
 * @time: 20:06
 */
public class demo47 {
    public static void main(String[] args) {
        //创建带缓存的线程池

        ExecutorService service = Executors.newCachedThreadPool();

        //执行10个任务
        for (int i = 0; i <10 ; i++) {
            service.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程名" + Thread.currentThread().getName());
                }
            });
        }
    }
}
