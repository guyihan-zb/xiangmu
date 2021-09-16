//左旋转字符串

public class Solution {
    public String LeftRotateString(String str,int n) {
        if(str.length()==0) return "";
        StringBuilder s1 = new StringBuilder();
        s1.append(str.substring(n,str.length()));
        s1.append(str.substring(0,n));
        return s1+"";
    }
}