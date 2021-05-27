package thread_0527;

import java.util.Date;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-27
 * @time: 20:45
 */
public class demo96 {
    public static void main(String[] args) {

        //创建读写锁

        ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

        ReentrantReadWriteLock.ReadLock readLock = readWriteLock.readLock();

        ReentrantReadWriteLock.WriteLock writeLock = readWriteLock.writeLock();


        ThreadPoolExecutor executor = new ThreadPoolExecutor(10,10,0,
                TimeUnit.SECONDS,new LinkedBlockingQueue<>());

        //读锁
        executor.execute(new Runnable() {
            @Override
            public void run() {

                //加锁
                readLock.lock();

                try {
                    //业务逻辑处理
                    System.out.println(Thread.currentThread().getName()+"执行了读锁操作"+ new Date());

                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }finally {
                    readLock.unlock();
                }
            }
        });
        //写锁

        executor.execute(new Runnable() {
            @Override
            public void run() {
                writeLock.lock();
                try {

                    System.out.println(Thread.currentThread().getName()+"执行了写锁操作" + new Date());
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }finally {
                    writeLock.unlock();
                }
            }
        });
    }
}
