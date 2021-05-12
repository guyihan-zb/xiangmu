package thread_0509;

import java.util.Date;
import java.util.concurrent.locks.LockSupport;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-12
 * @time: 21:40
 */
public class demo44 {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程进入休眠：" + new Date());

                //到达哪个时间点醒来
                LockSupport.parkUntil(System.currentTimeMillis() + 1000);

                System.out.println("线程终止休眠：" + new Date());
            }
        }).start();

    }
}
