package thread0425;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-04-27
 * @time: 16:43
 */
public class demo7 {
    public static void main(String[] args) {
        // lambda + 匿名 runnable 的实现方式
        Thread thread = new Thread(() -> {
            System.out.println("线程名：" +
                    Thread.currentThread().getName());
        });
        thread.start();
    }
}
