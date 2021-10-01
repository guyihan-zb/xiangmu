/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-09-28
 * @time: 19:47
 */
public class test2 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                say();
            }
        });
        t.run();
        System.out.print("hello");
    }

    public static void say(){
        System.out.print("world");
    }
}
