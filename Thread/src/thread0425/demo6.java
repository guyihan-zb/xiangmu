package thread0425;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-04-27
 * @time: 16:42
 */
public class demo6 {
    public static void main(String[] args) {
        // 匿名内部类的方式实现线程
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程名：" +
                        Thread.currentThread().getName());
            }
        });
        thread.start();

    }
}
