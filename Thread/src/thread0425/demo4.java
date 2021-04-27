package thread0425;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-04-27
 * @time: 16:33
 */
public class demo4 {
    public static void main(String[] args) {

        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("线程名：" +
                        Thread.currentThread().getName());
            }
        };
        thread.start();

    }

}
