import java.util.*;
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int len = array.length;
        Arrays.sort(array);
        int m = array[len/2];
        int count = 0;
        for(int i=0;i<len;i++){
            if(array[i]==m){
                count++;
            }
        }
        if(count>len/2){
            return m;
        }else{
            return 0;
        }
    }
}