//和为S的连续正数序列
import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for(int i=1;i<sum;i++){
            ArrayList<Integer> list = new ArrayList<>();
            int ans = i;
            for(int j=i+1;j<sum;j++){
                ans +=j;
                if(ans == sum){
                    for(int k=i;k<=j;k++){
                        list.add(k);
                    }
                    lists.add(list);
                    break;
                }
            }
        }
        return lists;
    }
}