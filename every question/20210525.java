import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s1 = sc.next();
            String s2 = sc.next();
            
            if(s1.length()<s2.length()){
                System.out.println(0);
            }
            int ret = 0;
            for(int i=0;i<=s1.length()-s2.length();){
                if(s1.substring(i,i+s2.length()).equals(s2)){
                    ret ++;
                    i=i+s2.length();
                }else{
                    i++;
                }
            }
            System.out.println(ret);
        }
    }
}