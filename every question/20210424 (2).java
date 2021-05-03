import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=0,b=0;
        while(sc.hasNext()){
            int n = sc.nextInt();
            int i = n/2;
            while(i>0){
                if(isPrime(i) && isPrime(n-i)){
                    System.out.println(i);
                    System.out.println(n-i);
                    break;
                }
                i--;
            }
        }
    }
    
    public static boolean isPrime(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
