package thread_0427;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-04
 * @time: 19:46
 */
public class Demo20 {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.interrupted());
                    System.out.println(Thread.currentThread().isInterrupted());
                }
            }
        });
        t1.start();

        // 终止线程
        t1.interrupt();

    }
}
