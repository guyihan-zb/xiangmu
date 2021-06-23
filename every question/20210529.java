import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int length = 0;
            int maxLength = 0;
            int n =  sc.nextInt();
             
            for (int i = 0; i <n ; i++) {
                String id = sc.next();
                String action = sc.next();
                 
                if (action.equals("connect")) {
                    length++;
                    if (maxLength < length) {
                        maxLength = length;
                    }
                } else {
                    length--;
                }
            }
            System.out.println(maxLength);
        }
    }
}