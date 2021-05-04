package thread_0427;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-04
 * @time: 21:43
 */
public class Demo22 {
    public static void main(String[] args) {

        // 打印所有线程
        for (Thread.State item : Thread.State.values()) {
            System.out.println(item);
        }


    }
}
