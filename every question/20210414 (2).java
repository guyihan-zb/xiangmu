import java.util.*;
public class Solution {
	public int MoreThanHalfNum_Solution(int [] array) {
		Arrays.sort(array);
		int count = 0;
		int len = array.length;
		int key = array[len/2];
		for(int i= 0;i < len ; i++){
			if(key==array[i]){
				count ++;
			}
		}
		if(count > len/2){
			return key;
		}else{
			return 0;
		}
	}
}