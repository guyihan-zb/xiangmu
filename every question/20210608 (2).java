
import java.util.*;
public class Main{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s=sc.nextLine();
            getName(s);
        }
    }
 
    private static void getName(String s) {
        char[] c=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <c.length ; i++) {
            if (c[i]=='_'){
                sb.append(Character.toUpperCase(c[i+1]));
                i++;
            }else {
                sb.append(c[i]);
            }
 
        }
        System.out.println(sb.toString());
 
    }
}