package thread_0527;

import sun.misc.Unsafe;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-27
 * @time: 19:24
 */
public class demo90 {
    private static AtomicInteger count = new AtomicInteger(0);
    //最大循环次数
    private static final int MAXSIZE = 100000;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <MAXSIZE ; i++) {
                    count.getAndIncrement();

                }
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <MAXSIZE ; i++) {
                    count.getAndDecrement(); // i--

                }
            }
        });
        t2.start();

        t1.join();
        t2.join();

        System.out.println("结果" + count);

        /*AtomicInteger count = new AtomicInteger(0);
        count.getAndIncrement();//i++
        count.incrementAndGet();//++i*/


    }
}
