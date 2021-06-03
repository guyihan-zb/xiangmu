import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            boolean flag = false;
            for(int i =0;i<str.length();i++){
                char ch = str.charAt(i);
                if(str.indexOf(ch)==str.lastIndexOf(ch)){
                    System.out.println(ch);
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println(-1);
            }
        }
    }
}