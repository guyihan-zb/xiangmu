//数字在升序数组中出现的次数

import java.util.*;
public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(!map.containsKey(array[i])){
                map.put(array[i],1);
            }else{
                int count = map.get(array[i]);
                map.put(array[i],++count);
            }
        }
        if(!map.containsKey(k)){
            return 0;
        }else{
            return map.get(k);
        }
    }
}