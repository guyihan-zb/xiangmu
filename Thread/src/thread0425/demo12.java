package thread0425;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-04-27
 * @time: 17:19
 */
public class demo12 {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }, "张三");
        System.out.println("线程状态：" + t1.getState());
        t1.start();
        System.out.println("线程状态II：" + t1.getState());
        System.out.println("线程ID：" + t1.getId());
        System.out.println("线程的名称：" + t1.getName());
        System.out.println("线程优先级：" + t1.getPriority());
        System.out.println("线程是否为后台线程：" + t1.isDaemon());
        System.out.println("线程是否存活" + t1.isAlive());
        System.out.println("线程是否被中断" + t1.isInterrupted());

    }
}
