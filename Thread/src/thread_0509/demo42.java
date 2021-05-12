package thread_0509;

import java.util.concurrent.locks.LockSupport;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-12
 * @time: 21:39
 */
public class demo42 {
    public static void main(String[] args) throws InterruptedException {

        Object lock = new Object();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程1：进入休眠");
                // 线程休眠
                LockSupport.park();
                //线程进入waiting状态

                System.out.println("线程1：执行完成");
            }
        }, "t1");


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程2：进入休眠");
                LockSupport.park();
                System.out.println("线程2：执行结束");
            }
        }, "t2");


        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程3：进入休眠");
                LockSupport.park();
                System.out.println("线程3：结束执行");
            }
        }, "t3");

        t1.start();
        t2.start();
        t3.start();

        //不能和notify进行混用  使用notify无法唤醒线程

        Thread.sleep(100);
        System.out.println("------------------");
        LockSupport.unpark(t3);

        Thread.sleep(100);
        LockSupport.unpark(t1);

        Thread.sleep(100);
        LockSupport.unpark(t2);


    }
}
