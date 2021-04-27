package thread0425;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-04-27
 * @time: 16:45
 */



/**
 * 创建并得到线程的执行结果
 * 实现 Callable 接口 + Future 的方式
 */
public class demo8 {
    // 创建了线程的任务和返回方法
    static class MyCallable implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            // 生成一个随机数
            int num = new Random().nextInt(10);
            System.out.println("子线程：" +
                    Thread.currentThread().getName() +
                    ",随机数：" + num);
            return num;
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 1.创建一个 Callable
        MyCallable myCallable = new MyCallable();
        // 2.创建一个 FutureTask 对象来接收返回值
        FutureTask<Integer> futureTask =
                new FutureTask<>(myCallable);
        // 3.创建 Thread
        Thread thread = new Thread(futureTask);
        // 启动线程
        thread.start();
        // 得到线程执行结果
        int result = futureTask.get();
        System.out.println(String.format("线程名：%s,数字：%d",
                Thread.currentThread().getName(), result));
    }
}
