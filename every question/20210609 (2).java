import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            char[] s1 = sc.next().toCharArray();
            char[] s2 = sc.next().toCharArray();
            int count = 0;
            for(int i=0;i<s1.length;i++){
                for(int j=0;j<s2.length;j++){
                    if(s1[i]==s2[j]){
                        count ++;
                        s2[j] = '1';
                        break;
                    }
                }
            }
            if(count==s2.length){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
