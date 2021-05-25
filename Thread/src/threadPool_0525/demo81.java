package threadPool_0525;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-25
 * @time: 18:56
 */
public class demo81 {

    static class OOMObject{
        private byte[] bytes = new byte[1*1024*1024];
    }

    static ThreadLocal<OOMObject> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <5 ; i++) {
            int fin = i;
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    OOMObject oomObject = new OOMObject();
                    System.out.println("任务"+ fin + "执行了");
                    //set thread local
                    threadLocal.set(oomObject);

                    //不用对象
                    oomObject = null;
                }
            });
            t.start();
            Thread.sleep(200);
        }
    }
}
