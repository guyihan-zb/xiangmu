package thread_0427;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-04
 * @time: 22:17
 */
public class Demo25 {
    static class Counter {
        // 定义的私有变量
        private int num = 0;
        // 任务执行次数
        private final int maxSize = 100000;

        // num++
        public void incrment() {
            for (int i = 0; i < maxSize; i++) {
                num++;
            }
        }

        // num--
        public void decrment() {
            for (int i = 0; i < maxSize; i++) {
                num--;
            }
        }

        public int getNum() {
            return num;
        }
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.incrment();
        counter.decrment();
        System.out.println("最终的执行结果：" + counter.getNum());

    }
}
