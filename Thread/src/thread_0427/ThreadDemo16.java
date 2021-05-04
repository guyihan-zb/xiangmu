package thread_0427;

import java.util.Date;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-04
 * @time: 15:56
 */
public class ThreadDemo16 {
    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("线程名：" +
                    Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {

        MyThread thread = new MyThread();
        thread.setName("张三");

        thread.start();
        thread.start();
//        thread.run();
//        thread.run();

    }
}
