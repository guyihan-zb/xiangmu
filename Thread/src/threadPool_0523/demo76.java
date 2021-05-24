package threadPool_0523;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-23
 * @time: 16:40
 */
public class demo76 {
    static ThreadLocal<String> threadLocal = new InheritableThreadLocal<>();

    public static void main(String[] args) {

        //不可继承性
        threadLocal.set("java");

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                String res = threadLocal.get();
                System.out.println("结果："+res);
            }
        });
        t1.start();
    }
}