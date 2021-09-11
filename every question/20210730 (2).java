//和为S的两个数字

暴力解法

import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        if(array==null||array.length<=1){
            return list;
        }
        int min = Integer.MAX_VALUE;
        int low =0, high = 0;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]+array[j] == sum){
                    if(array[i]*array[j]<min){
                        low = array[i];
                        high = array[j];
                        min = array[i]*array[j];
                    }
                }
            }
        }
        if(low ==0 || high ==0) return list;
        list.add(low);
        list.add(high);
        return list;
    }
}

最外层的乘积最小，别被题目误导

import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> result=new ArrayList<Integer>();
        //边界条件
        if(array==null||array.length<=1){
            return result;
        }
        int smallIndex=0;
        int bigIndex=array.length-1;
        while(smallIndex<bigIndex){
            //如果相等就放进去
             if((array[smallIndex]+array[bigIndex])==sum){
                result.add(array[smallIndex]);
                result.add(array[bigIndex]);
                 //最外层的乘积最小，别被题目误导
                 break;
        }else if((array[smallIndex]+array[bigIndex])<sum){
                 smallIndex++;
             }else{
                 bigIndex--;
             }
        }
        return result;
	}
}