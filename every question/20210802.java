//不用加减乘除做加法
//求1+2+3+...+n
//求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。

public class Solution {
    public int Sum_Solution(int n) {
        int sum=(int)Math.pow(n, 2)+n;
        return sum>>1;
    }
}


public class Solution {
    public int Add(int num1,int num2) {
        if(num2>0){
            for (int i = 0; i < num2; i++) {
                num1++;
            }
        }else{
            for(int i=0;i>num2;i--){
                num1--;
            }
        }
        return num1;
    }
}