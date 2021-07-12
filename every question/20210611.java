动态规划

10%     我的
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

 	20%
            if(n==1){
                System.out.println(arr[0]);
            }

            int k = sc.nextInt();
            int d = sc.nextInt();
            Arrays.sort(arr);
            for(int i=n-1;i>n-k;i--){
                if(Math.abs(arr[i]-arr[i-1])<=d){
                    System.out.println(arr[i]*arr[i-1]);
                }
            }
        }
    }
}