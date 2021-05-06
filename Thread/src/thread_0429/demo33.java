package thread_0429;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-05
 * @time: 16:18
 */
public class demo33 {
    public static void main(String[] args) {

        Lock lock = new ReentrantLock();

        lock.lock();
        try {
            int num = 1 / 0;
        } finally {
            lock.unlock();
        }

    }
}
