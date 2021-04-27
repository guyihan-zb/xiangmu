package thread0425;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-04-27
 * @time: 17:03
 */
public class demo10 {
    public static void main(String[] args) {
        // 创建一个任务
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
//                String data = "ABCD";
//                for (char item : data.toCharArray()) {
//                    System.out.print(item);
//                    try {
//                        // 休眠一段时间
//                        Thread.sleep(1);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }

                System.out.println("线程名：" +
                        Thread.currentThread().getName());
                try {
                    Thread.sleep(9999999);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        Thread t1 = new Thread(runnable, "张三");
        Thread t2 = new Thread(runnable, "李四");
        t1.start();
        t2.start();
    }
}
