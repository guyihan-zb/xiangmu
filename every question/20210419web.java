import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] s1 = new int [n];
        while(sc.hasNext()){
            for(int i=0;i<n;i++){
                s1[i]=sc.nextInt();
            }
        }
        Arrays.sort(s1);
        for(int i=0;i<n;i++){
            if(i==0){
                if(s1[i]!=s1[i+1]){
                    System.out.print(s1[i]+" ");
                }
            }else if(i==n-1){
                if(s1[n-1]!=s1[n-2]){
                    System.out.print(s1[i]+" ");
                }
            }else{
                if(s1[i]!=s1[i-1] && s1[i]!=s1[i+1]){
                    System.out.print(s1[i]+" ");
                }
            }
        }
    }
}