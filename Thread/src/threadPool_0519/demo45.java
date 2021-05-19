package threadPool_0519;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-19
 * @time: 19:35
 */
public class demo45 {
    public static void main(String[] args) {

        //创建固定个数的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);

        for(int i =0;i<2;i++){
            //执行任务
            service.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程名:" +Thread.currentThread().getName());
                    //说明是使用线程池来创建线程
                }
            });
        }

    }
}
