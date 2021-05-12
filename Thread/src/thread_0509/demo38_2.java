package thread_0509;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-12
 * @time: 13:01
 */
public class demo38_2 {
    public static void main(String[] args) throws InterruptedException {

        Object lock = new Object();

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
        synchronized (lock) {
            // 唤醒线程
            lock.notify();
        }
    }
}
