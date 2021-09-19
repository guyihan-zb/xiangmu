/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-09-18
 * @time: 17:06
 */
import java.util.*;
public class test1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(sc.hasNext()){
            String str = sc.nextLine();
            if(panduan(str)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    public static boolean panduan(String str){
        if(str.length()==1){
            return false;
        }
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        if(sb.equals(str)){
            return true;
        }else{
            return false;
        }
    }
}