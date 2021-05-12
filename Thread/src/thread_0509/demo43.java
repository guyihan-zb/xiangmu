package thread_0509;

import java.util.concurrent.locks.LockSupport;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-12
 * @time: 21:40
 */
public class demo43 {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                //先获得当前的线程在使用isInterrupted方法
                System.out.println("休眠之前 Interrupt 状态" +
                        Thread.currentThread().isInterrupted());
                //Thread.interrupted() 也可以得到interrupt的状态
                LockSupport.park();
                System.out.println("休眠之前 Interrupt 状态" +
                        Thread.currentThread().isInterrupted());
            }
        });
        t1.start();

        Thread.sleep(1000);
        // 终止线程
        t1.interrupt();
        LockSupport.unpark(t1);
    }
}
