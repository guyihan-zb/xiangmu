import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] a = new int [str.length-1];
        int k=0;
        for(int i=0;i<str.length;i++){
            if(i<str.length-1){
                a[i]=Integer.parseInt(str[i]);
            }else{
                k=Integer.parseInt(str[i]);
            }
        }
        Arrays.sort(a);
        for(int i=0;i<k;i++){
            if(i<k-1){
                System.out.print(a[i]+" ");
            }else{
                System.out.print(a[i]);
            }
        }
    }
}