import java.util.Scanner;
 
/**
 * Created by Olive on 2017/9/7.
 * ***上站着一支队伍，她们是来自全国各地的扭秧歌代表队，现在有她们的身高数据，
 * 请你帮忙找出身高依次递增的子序列。 例如队伍的身高数据是（1、7、3、5、9、4、8），
 * 其中依次递增的子序列有（1、7），（1、3、5、9），（1、3、4、8）等，其中最长的长度为4。
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int[] height = new int[n];
            for(int i = 0; i < n; i++){
                height[i] = in.nextInt();
            }
            System.out.println(longest(height, n));
        }
    }
 
    public static int longest(int[] height, int n){
        if(height == null || n <= 0 || height.length != n)
            return 0;
        // dp[i]代表以i为结尾的最长递增子序列的长度
        int[] dp = new int[n];
        dp[0] = 1;
        int max = 1;
        for(int i = 1; i < n; i++){
            dp[i] = 1;
            for(int j = i - 1; j >= 0; j--){
                if(height[i] > height[j])
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            if(max < dp[i])
                max = dp[i];
        }
 
        return max;
    }
}