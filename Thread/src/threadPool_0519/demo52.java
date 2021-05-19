package threadPool_0519;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-19
 * @time: 21:05
 */
public class demo52 {
    public static void main(String[] args) {
        //单个线程的线程池
        ExecutorService service = Executors.newSingleThreadExecutor();


        for (int i = 0; i < 10; i++) {
            service.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程名：" + Thread.currentThread().getName());
                }
            });
        }

    }
}
