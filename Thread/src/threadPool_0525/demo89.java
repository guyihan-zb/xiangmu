package threadPool_0525;

import java.util.Random;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-25
 * @time: 21:17
 */
public class demo89 {
    static class MyBlockingQueue{
        private int[] values; //实际存储数据的数组
        private int first; //队首
        private int last; //队尾
        private int size; //队列元素的实际大小
        public MyBlockingQueue(int initial){
            //初始化变量
            values = new int [initial];
            first = 0;
            last = 0;
            size = 0;
        }

        //添加元素
        public void offer(int val){
            synchronized (this){
                //判断边界值
                if(size == values.length){
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                values[last] = val;
                last ++;
                size ++;
                if(last==values.length){
                    last = 0;
                }

                this.notify();
            }
        }

        //查询方法
        public int poll(){
            int result = -1;
            synchronized (this){
                //判断边界值
                if(size == 0){
                    //队列为空，阻塞等待
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                result = values[first++];
                size--;
                //判断是否为第一个元素
                if(first==values.length){
                    first = 0;
                }
                //尝试唤醒生产者
                this.notify();
            }
            return result;
        }
    }

    public static void main(String[] args) {
        MyBlockingQueue myBlockingQueue = new MyBlockingQueue(100);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                //每隔500毫秒生产一条数据
                while(true){
                    int num = new Random().nextInt(10);
                    System.out.println("生产了随机数" + num);
                    myBlockingQueue.offer(num);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        });

        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                //每隔500毫秒生产一条数据
                while(true){
                    int result = myBlockingQueue.poll();
                    System.out.println("消费了数据"+ result);

                }
            }
        });
        t2.start();
    }
}
