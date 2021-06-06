public class Solution {
    public int jumpFloorII(int target) {
        int f0 =1,f1=1;
        if(target==0){
            return 1;
        }else if(target==1){
            return 1;
        }else{
            return 2*jumpFloorII(target-1);
        }
    }
}