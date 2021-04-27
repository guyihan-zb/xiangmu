package thread0425;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-04-27
 * @time: 16:35
 */
public class demo5 {
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("线程名：" +
                    Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        // 1.新建 Runnable 类
        MyRunnable runnable = new MyRunnable();
        // 2.新建 Thread
        Thread thread = new Thread(runnable);
        // 3.启动线程
        thread.start();

    }
}
