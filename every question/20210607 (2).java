
这是两个数的和，但是根据题目可能会有3个数求和，所以这种是错的

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            for(int i=1;i<=n/2;i++){
                for(int j=n;j>=n/2;j--){
                    if(i+j==m){
                        System.out.println(i+" "+j);
                    }
                }
            }
            if(n==m){
                System.out.println(m);
            }
        }
    }
}
