//翻转单词序列

public class Solution {
    public String ReverseSentence(String str) {
        if(str.length()==0) return "";
        StringBuilder sb = new StringBuilder();
        String [] s = str.split(" ");
        for(int i=s.length-1;i>=0;i--){
            if(i!=0){
                sb.append(s[i]+" ");
            }else{
                sb.append(s[i]);
            }
        }
        return sb+"";
    }
}


//扑克牌顺子

import java.util.*;

public class Solution {
    public boolean IsContinuous(int [] numbers) {
        int mini = 100;
        int max = 0;
        int countzero = 0;
        boolean flag = false;
        for(int i = 0;i<numbers.length;i++){
            if(numbers[i] == 0){
                countzero++;
                continue;
            }
            if(numbers[i] < mini){
                mini = numbers[i];
            }
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        if(max-mini+countzero == 4 || max-mini == 4){
            return true;
        }else{
            return false;
        }
    }
}