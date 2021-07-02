import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = "";
            String str = sc.nextLine();
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                    s+=str.charAt(i);
                }
            }
            System.out.println(s.toString());
        }
    }
}