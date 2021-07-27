//二进制中1的个数


public class Solution {
    public int NumberOf1(int n) {
        int count = 0;
        while(n!=0){
            count++;
            n=n&(n-1);
        }
        return count;
    }
}



1、先将数字转换成二进制字符串
2、用String.split()函数存入一个数组中
3、遍历数组跟1比较，同时计数
4、输出计数值


public class Solution {
    public int NumberOf1(int n) {
        String s=Integer.toBinaryString(n);
        String[] split=s.split("");
        int a=0;
        for(int i = 0; i < split.length; i++) {
            if (split[i].equals("1"))
                {
                    a++;
                }
        }
             return a;
    }
}
