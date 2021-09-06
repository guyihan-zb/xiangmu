//数组中只出现一次的两个数字

哈希

import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param array int整型一维数组 
     * @return int整型一维数组
     */
    public int[] FindNumsAppearOnce (int[] array) {
        // write code here
        int [] arr = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(array);
        for(int i=0;i<array.length;i++){
            if(!map.containsKey(array[i])){
                map.put(array[i],1);
            }else{
                int count = map.get(array[i]);
                map.put(array[i],++count);
            }
        }
        int count = 0;
        for(int i=0;i<array.length;i++){
            if(map.get(array[i])==1){
                arr[count++] = array[i];
            }
        }
        return arr;
    }
}