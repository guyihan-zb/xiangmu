package threadPool_0523;

import java.util.concurrent.*;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-23
 * @time: 09:48
 */
public class demo57 {

    private static int count = 1;
    public static void main(String[] args) {


        ThreadFactory threadFactory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread t =new Thread(r);
                t.setName("mythreadpool-" + count ++);
                return t;
            }
        };

        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(5,5,0,
                        TimeUnit.SECONDS,new LinkedBlockingQueue<>(1000),threadFactory);
        for (int i = 0; i <5 ; i++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程名：" + Thread.currentThread().getName());
                }
            });
        }

    }
}
