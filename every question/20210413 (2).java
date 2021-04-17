
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] strArr = str.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i = strArr.length-1;i>=0;i--){
           sb.append(strArr[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}