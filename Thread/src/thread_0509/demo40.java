package thread_0509;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-12
 * @time: 13:03
 */
public class demo40 {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        //wait在进程中释放锁
        //而sleep在线程执行完成后才能释放锁

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("线程1：拥有了锁 lock，进入休眠状态");
                    try {
                        lock.wait(999999 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


//                    try {
//                        Thread.sleep(3 * 1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println("线程1：执行完成，释放锁 lock");
                }
            }
        });
        t1.start();

        Thread.sleep(1000);
        // 主线程试图获取锁
        synchronized (lock) {
            System.out.println("主线程获取到锁 lock");
        }


    }
}
