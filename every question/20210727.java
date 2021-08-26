//第一个只出现一次的字符

public class Solution {
    public int FirstNotRepeatingChar(String str) {
        char strArray[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(str.indexOf(strArray[i])==str.lastIndexOf(strArray[i])){
                return i;
            }
        }
        return -1;
    }
}