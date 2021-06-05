package thread_0530;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-30
 * @time: 10:02
 */

/*
* 循环屏障实例
* */



public class demo100 {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("执行了CyclicBarrier里面的runnable");
            }
        });

        for (int i = 1; i <11 ; i++) {
            int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"开始起跑");
                    try {
                        Thread.sleep(200*finalI);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }



                    try {
                        System.out.println(Thread.currentThread().getName()+"等待其他人---------------");
                        //计数器-1  判断计数器是否为0
                        cyclicBarrier.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }

                    //说明已经有1组线程满足条件了
                    System.out.println(Thread.currentThread().getName()+"执行结束***************");

                }
            }).start();
        }
    }
}
