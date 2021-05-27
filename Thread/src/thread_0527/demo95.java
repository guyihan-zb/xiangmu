package thread_0527;

import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-27
 * @time: 19:49
 */

/*
* ABA问题解决
* 添加了版本号
* */
public class demo95 {

    private static AtomicStampedReference money = new AtomicStampedReference(1000,1);
    //private static AtomicReference money = new AtomicReference(100);

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                boolean result = money.compareAndSet(1000,0,1,2);
                System.out.println("第一次转账:"+ result);
            }
        });
        t1.start();

        t1.join();

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean result = money.compareAndSet(0,1000,2,3);
                System.out.println("第一次转账:"+ result);
            }
        });

        t3.start();

        t3.join();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean result = money.compareAndSet(1000,0,1,2);
                System.out.println("第一次转账:"+ result);
            }

        });
        t2.start();


    }
}
