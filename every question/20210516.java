import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String str=scanner.next();
            while(str.length()>1){
                int result=0;
                for(int i=0;i<str.length();i++)
                    result+=str.charAt(i)-'0';
                str=String.valueOf(result);
            }
            System.out.println(str);
        }
    }
}
