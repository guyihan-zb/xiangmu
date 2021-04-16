import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] s = new String[2];
        String s1 = "";
        String s2 = "";
        for(int i=0;i<2;i++){
            s[i] = sc.nextLine();
        }
        s1 = s[0];
        s2 = s[1];
        del(s1,s2);
    }
    public static void del(String s1,String s2){
        for(int i=0;i<s2.length();i++){
            String temp = String.valueOf(s2.charAt(i));
            s1 = s1.replaceAll(temp,"");
        }
        System.out.println(s1);
    }
}