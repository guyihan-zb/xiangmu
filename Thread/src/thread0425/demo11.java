package thread0425;

import java.util.Random;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-04-27
 * @time: 17:12
 */


/**
 * 演示线程分组
 */
public class demo11 {
    public static void main(String[] args) {
        // 定义任务
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("开始起跑:" +
                        Thread.currentThread().getName());
                try {
                    int num = 1 + new Random().nextInt(5);
                    Thread.sleep(num * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("到终点了：" +
                        Thread.currentThread().getName());
            }
        };
        // 定义分组
        ThreadGroup group = new ThreadGroup("百米赛跑一组");
        // 创建运动员
        Thread t1 = new Thread(group, runnable, "张三");
        Thread t2 = new Thread(group, runnable, "李四");
//        Thread t1 = new Thread(runnable, "张三");
//        Thread t2 = new Thread(runnable, "李四");
        t1.start();
        t2.start();

        // 打印线程分组的详情
        group.list();

        // 等待所有选手到达终点
        while (group.activeCount() != 0) {
        }

        // 宣布成绩
        System.out.println("宣布成绩");

    }
}
