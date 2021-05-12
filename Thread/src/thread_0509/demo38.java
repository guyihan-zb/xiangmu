package thread_0509;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-12
 * @time: 12:44
 */
public class demo38 {
    public static void main(String[] args) throws InterruptedException {

        Object lock = new Object();
        Object lock2 = new Object();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程1：进入休眠。");
                synchronized (lock) {
                    try {
                        // 线程休眠
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("线程1：执行完成！");
            }
        }, "t1");
        t1.start();

        Thread.sleep(1000);
        System.out.println("主线程唤醒线程1");
        synchronized (lock2) {
            // 唤醒线程
            lock2.notify();
        }
    }
}
