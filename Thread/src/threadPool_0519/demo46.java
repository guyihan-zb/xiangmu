package threadPool_0519;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-19
 * @time: 19:55
 */
public class demo46 {
    public static void main(String[] args) {
        //线程工厂
        MyThreadFactory myThreadFactory = new MyThreadFactory();


        ExecutorService service = Executors.newFixedThreadPool(10,myThreadFactory);
        for(int i =0;i<10;i++){
            service.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程名+" + Thread.currentThread().getName()+",线程优先级"
                    +Thread.currentThread().getPriority());
                }
            });
        }
    }

    private static int count = 1;

    static class MyThreadFactory implements ThreadFactory {
        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r);
            //设置线程池的命名
            thread.setName("myThreadPool-" + count++);

            //设置线程池的优先级
            thread.setPriority(10);
            return thread;
        }
    }
}
