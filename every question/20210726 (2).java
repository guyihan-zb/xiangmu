//整数中1出现的次数（从1到n整数中1出现的次数）

public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
		int count=0;
    	StringBuffer s=new StringBuffer();
    	for(int i=1;i<n+1;i++){
    		 s.append(i);
    	}
    	String str=s.toString();
    	for(int i=0;i<str.length();i++){
    		if(str.charAt(i)=='1')
    			count++;
    	}
    	return count;
    }
}