package thread_0530;

import java.util.concurrent.CyclicBarrier;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-30
 * @time: 10:52
 */
public class demo101 {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("执行了CyclicBarrier里面的runnable");
            }
        });
    }
}
