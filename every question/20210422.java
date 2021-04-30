import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s1 = 0,s2 = 1;
            while(s2<=n){
                    int s3 = s1+s2;
                    s1=s2;
                    s2=s3;
            }
        int a = s2-n;
        int b = n-s1;
        System.out.println((a>b)?b:a);
    }
}
