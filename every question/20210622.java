//替换空格

import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param s string字符串 
     * @return string字符串
     */
    public String replaceSpace (String s) {
        // write code here
        StringBuilder sb = new StringBuilder();
        if(s==null){
            return s;
        }
        String[] strs = s.split("");
        for(String str:strs){
            if(str.equals(" ")){
                sb.append("%20");
            }else{
                sb.append(str);
            }
        }
        return sb.toString();
    }
}