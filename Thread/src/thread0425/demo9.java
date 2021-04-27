package thread0425;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-04-27
 * @time: 17:02
 */
public class demo9 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("开始时间：" + new Date());
//        // 休眠 1s
//        Thread.sleep(1000);
//        // 休眠的实现方式 2
//        TimeUnit.SECONDS.sleep(1); // 休眠 1s

        // 休眠实现方式 3
        Thread.sleep(TimeUnit.SECONDS.toMillis(1));

        System.out.println("结束时间：" + new Date());
    }
}
