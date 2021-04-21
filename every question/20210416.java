import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String a = sc.nextLine();
            String b = sc.nextLine();
            int m = 0;
            for(int i=0;i<a.length()+1;i++){
                String str = a.substring(0,i)+b+a.substring(i,a.length());
                StringBuffer sb = new StringBuffer(str);
                if(sb.reverse().toString().equals(str)){
                    m++;
                }
            }
            System.out.print(m);
        }
    }
}