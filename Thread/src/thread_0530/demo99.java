package thread_0530;

import java.util.concurrent.CountDownLatch;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-30
 * @time: 09:44
 */
public class demo99 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(5);

        for (int i = 1; i <6 ; i++) {
            int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"开始起跑");
                    try {
                        Thread.sleep(1000*finalI);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName()+"到达终点");

                    //将计数器减1
                    latch.countDown();

                }
            }).start();
        }

        //阻塞等待
        latch.await();
        System.out.println("所有人都到达终点，公布排名");
    }
}
