package thread_0527;

import java.util.concurrent.atomic.AtomicReference;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-27
 * @time: 19:49
 */

/*
* ABA问题演示
* */
public class demo92 {

    private static AtomicReference money = new AtomicReference(100);

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                boolean result = money.compareAndSet(100,0);
                System.out.println("第一次转账"+ result);
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                money.compareAndSet(100,0);
            }
        });
        t2.start();
    }
}
