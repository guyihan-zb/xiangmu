import java.util.*;
import java.math.*;
 
public class Main{
    public static void main(String[] args){
        BigInteger[] people=new BigInteger[85];
        people[0]=new BigInteger("1");
        people[1]=new BigInteger("1");
        for(int i=2;i<85;i++){
            people[i]=people[i-1].add(people[i-2]);
        }
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int from=sc.nextInt();
            int to=sc.nextInt();
            BigInteger result=new BigInteger("0");
            for(int i=from-1;i<to;i++){
                result=result.add(people[i]);
            }
            System.out.println(result);
        }
    }
}