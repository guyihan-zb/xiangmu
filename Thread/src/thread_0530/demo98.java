package thread_0530;

import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-30
 * @time: 09:22
 */

/*
* 信号量
* */
public class demo98 {
    public static void main(String[] args) {

        //创建信号量
        Semaphore semaphore = new Semaphore(2);

        ThreadPoolExecutor executor = new ThreadPoolExecutor(10,10,0,
                TimeUnit.SECONDS,new LinkedBlockingQueue<>(100));

        //创建任务 1
        for (int i = 0; i <4 ; i++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+ "到达停车场");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //试图进入停车场
                    try {
                        semaphore.acquire();
                        //代码执行到此处，说明已经获取到锁了

                        System.out.println(Thread.currentThread().getName()+"进入停车场----------------");

                        //车辆停留的时间
                        int num = 1+  new Random().nextInt(5);
                        try {
                            Thread.sleep(num*1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }


                        System.out.println(Thread.currentThread().getName()+"离开停车场**************");

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally {
                        //释放锁
                        semaphore.release();
                    }

                }
            });
        }
    }
}
