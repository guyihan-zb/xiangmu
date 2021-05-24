import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            StringBuffer sb = new StringBuffer(str);
            System.out.println(sb.reverse().toString());
        }
    }
}