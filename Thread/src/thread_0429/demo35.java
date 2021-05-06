package thread_0429;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-05
 * @time: 16:40
 */
public class demo35 {
    // 全局变量
    private static int number = 0;
    // 循环次数
    private static final int maxSize = 100000;

    public synchronized void increment() {
        for (int i = 0; i < maxSize; i++) {
            // 实现加锁
            number++;
        }
    }

    public synchronized void decrement() {
        for (int i = 0; i < maxSize; i++) {
            number--;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        demo35 threadDemo35 = new demo35();

        // +10w
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                threadDemo35.increment();
            }
        });
        t1.start();

        // -10w
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                threadDemo35.decrement();
            }
        });
        t2.start();

        // 等待线程 1 和线程 2 执行完
        t1.join();
        t2.join();

        System.out.println("最终执行结果：" + number);

    }
}
