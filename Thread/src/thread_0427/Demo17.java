package thread_0427;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-04
 * @time: 16:30
 */
public class Demo17 {
    // 全局自定义变量
    private static boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
        // 转账线程
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!flag) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("别烦我，我正在转账呢");
                }
                System.out.println("终止转账");
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(310);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 改变变量的状态来终止线程的执行
                System.out.println("停止交易，有内鬼。");
                flag = true;
            }
        });
        t2.start();

        t1.join();
        t2.join();

    }
}
