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

二分法 找到k的位置mid，然后k必然在left和right之间，遍历即可

public class Solution {
    public int GetNumberOfK(int [] array , int k) {
       if(array==null||array.length==0) return 0;
        int left=0,right=array.length-1;
        int mid=0,cnt=0;
        while(left<right){
            mid=left+(right-left)/2;
            if(array[mid]>k)
                right=mid-1;
            else if(array[mid]<k)
                left=mid+1;
            else{
                break;
            }
        }
        for(int i=left;i<=right;i++)
            if(array[i]==k)
                cnt++;
        return cnt;

    }
}