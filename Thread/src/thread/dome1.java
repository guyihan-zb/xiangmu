package thread;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-04-22
 * @time: 21:21
 */
public class dome1 {
    public static void main(String[] args) {
        //
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                //让程序等待一定的时间
                try {
                    //业务代码
                    Thread.sleep(60*60*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        //启动线程
        thread.start();
    }
}
