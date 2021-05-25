package threadPool_0525;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-25
 * @time: 20:29
 */
public class demo86 {

    static class Singleton {
        //1.创建私有的构造函数  防止其他类直接创建
        private Singleton() {

        }

        //定义私有变量
        private static Singleton singleton = null;

        //创建统一的访问方法
        public static Singleton getInstance()  {
            if(singleton==null){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                singleton = new Singleton();
            }
            return singleton;
        }
    }

    private static Singleton s1 = null;
    private static Singleton s2 = null;
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                s1 = Singleton.getInstance();
            }
        });

        t1.start();


        //创建对象
        s2 = Singleton.getInstance();

        t1.join();

        System.out.println(s1==s2);
    }
}
