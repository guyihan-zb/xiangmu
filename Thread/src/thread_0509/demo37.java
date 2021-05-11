package thread_0509;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-11
 * @time: 22:04
 */
public class demo37 {
    public static void main(String[] args) {
        // 锁A（资源A）
        Object lockA = new Object();
        // 锁B（资源B）
        Object lockB = new Object();
        // 线程1
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                // 得到锁A
                synchronized (lockA) {
                    System.out.println("线程1：得到了锁A");
                    try {
                        // 休眠 1s，让线程 2 先得到锁B
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("线程1：等待获取锁B");
                    // 尝试获取锁B
                    synchronized (lockB) {
                        System.out.println("线程1：得到了锁B");
                    }
                }
            }
        }, "t1");
        t1.start();

        // 创建并启动线程2
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                // 得到锁B
                synchronized (lockA) {
                    System.out.println("线程2：获取到了锁A");
                    try {
                        // 休眠 1s（让线程1先过去到锁A）
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("线程2：等待获取锁B");
                    // 尝试获取资源A
                    synchronized (lockB) {
                        System.out.println("线程2：获取到锁B");
                    }
                }
            }
        }, "t2");
        t2.start();


    }
}
