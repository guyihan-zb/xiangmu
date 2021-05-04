package thread_0427;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-05
 * @time: 00:13
 */
public class Demo27 {
    private static boolean flag = false;

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!flag) {

                }
                System.out.println("终止执行");
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("设置 flag=true");
                flag = true;
            }
        });
        t2.start();
    }

}
