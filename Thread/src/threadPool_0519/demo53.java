package threadPool_0519;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-19
 * @time: 21:08
 */
public class demo53 {
    public static void main(String[] args) {
        //根据当前工作环境创建线程   异步
        ExecutorService service = Executors.newWorkStealingPool();
        for (int i = 0; i <10 ; i++) {
            service.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程名：" +
                            Thread.currentThread().getName());
                }
            });
        }
        //等待异步线程池执行完成（根据线程池的终止状态）
        while (!service.isTerminated()){
        }
    }
}
