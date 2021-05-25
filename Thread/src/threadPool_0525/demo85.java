package threadPool_0525;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-25
 * @time: 20:29
 */
public class demo85 {

    static class Singleton {
        //1.创建私有的构造函数  防止其他类直接创建
        private Singleton() {

        }

        //定义私有变量
        private static Singleton singleton = null;

        //创建统一的访问方法
        public static Singleton getInstance() {
            if(singleton==null){
                singleton = new Singleton();
            }
            return singleton;
        }
    }

    public static void main(String[] args) {
        //创建对象
        Singleton s1 =new Singleton();

        Singleton s2 =new Singleton();

        System.out.println(s1==s2);
    }
}
