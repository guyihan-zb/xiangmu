package threadPool_0523;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-23
 * @time: 10:55
 */
public class demo61 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(5,5,0,
                        TimeUnit.SECONDS,new LinkedBlockingQueue<>(1000));

        //返回参数
        executor.submit(new Callable<Integer>() {
           @Override
            public Integer call(){
               int num = new Random().nextInt(10);
               System.out.println("线程池生成了随机数："+num);
               return num;
           }
        });
    }
}
