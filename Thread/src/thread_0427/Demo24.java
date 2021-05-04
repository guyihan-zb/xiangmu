package thread_0427;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-04
 * @time: 22:06
 */
public class Demo24 {
    private static final int maxSize = 1000;

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < maxSize; i++) {
                // 出让 CPU 执行权
//                Thread.yield();
                System.out.println("我是t1");
            }
        }, "t1");
        t1.start();

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < maxSize; i++) {
                System.out.println("我是t2");
            }
        }, "t2");
        t2.start();


    }
}
