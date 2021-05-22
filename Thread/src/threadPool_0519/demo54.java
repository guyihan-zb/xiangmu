package threadPool_0519;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-19
 * @time: 21:26
 */
public class demo54 {
    public static void main1(String[] args) throws InterruptedException {
        Thread.sleep(99999);
    }

    public static void main(String[] args) throws InterruptedException {
        Object[] objects = new Object[15];

        ExecutorService service = Executors.newFixedThreadPool(15);
        for (int i = 0; i < 15; i++) {
            int finalI = i;
            service.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("执行：" + finalI);
                    MyOOMClass myOOMClass = new MyOOMClass();
                    objects[finalI] = myOOMClass;
                }
            });
        }
    }

    static class MyOOMClass {
        // 创建一个大对象 1M（M -> KB -> B）
        private byte[] btyes = new byte[1 * 1024 * 1024];
    }
}
