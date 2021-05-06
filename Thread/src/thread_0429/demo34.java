package thread_0429;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-05
 * @time: 16:37
 */
public class demo34 {
    public static void main(String[] args) throws InterruptedException {
        // 声明一个公平锁
        Lock lock = new ReentrantLock(true);

        // 公共任务
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (char item : "ABCD".toCharArray()) {
                    lock.lock();
                    try {
                        System.out.print(item);
                    } finally {
                        lock.unlock();
                    }
                }
            }
        };

        Thread t1 = new Thread(runnable, "t1");
        Thread t2 = new Thread(runnable, "t2");

        Thread.sleep(10);
        t1.start();
        t2.start();

    }
}
