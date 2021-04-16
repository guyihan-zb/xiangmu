import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            sc.nextLine();
            int [] a = new int [3*n];
            for(int i=0;i<3*n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            int end = 3 * n - 1;
            int begin = 0;
            long sum = 0;
            while (end > begin) {
                sum = sum + a[end - 1];
                end = end - 2;
                begin = begin + 1;
            }
            System.out.println(sum);
        }
    }
}