
//调整数组顺序使奇数位于偶数前面
import java.util.*;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param array int整型一维数组 
     * @return int整型一维数组
     */
    public int[] reOrderArray (int[] array) {
        // write code here
        if(array==null||array.length==0){
            return array;
        }
        int len = array.length;
        int j=0,temp=0;
        for(int i=0;i<len;i++){
            temp = array[i];
            if(array[i]%2==0){
                continue;
            }else{
                int k = i;
                while(k>j){
                    array[k] = array[k-1];
                    k--;
                }
                array[k] = temp;
                j++;
            }
        }
        return array;
    }
}


import java.util.*;
public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param array int整型一维数组 
     * @return int整型一维数组
     */
    public int[] reOrderArray (int[] array) {
        // write code here
        if(array.length == 0){
            return array;
        }
        Queue<Integer> jishu = new LinkedList<>();
        Queue<Integer> oushu = new LinkedList<>();
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                oushu.add(array[i]);
            }else{
                jishu.add(array[i]);
            }
        }
        for(int i=0;i<array.length;i++){
            if(!jishu.isEmpty()){
                array[i] = jishu.poll();
            }else{
                array[i] = oushu.poll();
            }
        }
        return array;
    }
}