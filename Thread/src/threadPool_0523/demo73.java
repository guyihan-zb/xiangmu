package threadPool_0523;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-23
 * @time: 15:29
 */
public class demo73 {
    static ThreadLocal<SimpleDateFormat> threadLocal =
 //           ThreadLocal.withInitial(()-> new SimpleDateFormat("mm:ss"));
    ThreadLocal.withInitial(new Supplier<SimpleDateFormat>() {
        @Override
        public SimpleDateFormat get() {
            System.out.println("-------执行初始化方法--------");
            return new SimpleDateFormat("mm:ss");
        }
    });

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(10,10,0,
                TimeUnit.SECONDS,new LinkedBlockingQueue<>(1000));

        for (int i = 0; i < 1001; i++) {
            int fin = i;
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    Date date = new Date(fin * 1000);
                    myformat(date);
                }
            });
        }
    }

    public static void myformat(Date date){
        String res = threadLocal.get().format(date);
        System.out.println("时间："+ res);
    }
}
