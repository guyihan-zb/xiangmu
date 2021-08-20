//数组中出现次数超过一半的数字
import java.util.Arrays;
 
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        int count=0;
         
        for(int i=0;i<array.length;i++){
            if(array[i]==array[array.length/2]){
                count++;
            }
        }
        if(count>array.length/2){
            return array[array.length/2];
        }else{
            return 0;
        }
         
    }
}


//hashmap
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
    	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i=0;i<array.length;i++){
            
            if(!map.containsKey(array[i])){
               map.put(array[i],1); 
            }else{
                int count = map.get(array[i]);
                map.put(array[i],++count);
            }
        }
        Iterator iter = map.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry entry = (Map.Entry)iter.next();
            Integer key =(Integer)entry.getKey();
            Integer val = (Integer)entry.getValue();
            if(val>array.length/2){
                return key;
            }
        }
        return 0;
}