package threadPool_0523;

import java.util.function.Supplier;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-23
 * @time: 15:18
 */
public class demo70 {
    static ThreadLocal<String> threadLocal = ThreadLocal.withInitial(new Supplier<String>() {
        @Override
        public String get() {
            System.out.println("执行了初始化方法");
            return "java";
        }
    });

    public static void main(String[] args) {
        String result = threadLocal.get();
        System.out.println("结果" +result);
    }


}
