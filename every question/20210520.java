public class Solution {               
        public int getFirstUnFormedNum(int[] arr) {
         
        if(arr == null || arr.length == 0)
            return 1;
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max += arr[i];
            min = Math.min(min,arr[i]);
        }
 
        boolean form[] = new boolean[max + 1];
        form[0] = true; // 为了使单个元素去求和时是真的  (i + 0 = i)
        for (int i = 0; i < arr.length; i++) {
            for (int j = max; j >= arr[i]; j--) {
                form[j] = form[j - arr[i]] || form[j];
            }
        }
 
        for (int i = min; i < form.length; i++) {
            if(!form[i])
                return i;
        }
 
        return max + 1;     }
}
