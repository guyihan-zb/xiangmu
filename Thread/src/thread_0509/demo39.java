package thread_0509;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-12
 * @time: 12:58
 */
public class demo39 {
    public static void main(String[] args) throws InterruptedException {

        Object lock = new Object();
        Object lock2 = new Object();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程1：进入休眠");
                synchronized (lock) {
                    try {
                        // 线程休眠
                        lock.wait(0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("线程1：执行完成");
            }
        }, "t1");
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程2：进入休眠");
                synchronized (lock) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("线程2：执行结束");
            }
        }, "t2");
        t2.start();

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程3：进入休眠");
                synchronized (lock2) {
                    try {
                        lock2.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("线程3：结束执行");
            }
        }, "t3");
        t3.start();

        Thread.sleep(2000);
        System.out.println("主线程唤醒线程");
        synchronized (lock) {
            // 唤醒线程
            lock.notifyAll();
        }
    }
}
