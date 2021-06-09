import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger c = sc.nextBigInteger();
            BigInteger [] s = new BigInteger []{a,b,c};
            Arrays.sort(s);
            if((s[0].add(s[1])).compareTo(s[2])>0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}