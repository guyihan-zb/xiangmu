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