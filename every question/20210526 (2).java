import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            
            long [] arr = new long [91];
            arr[1] = 1;
            arr[2] = 2;
            for(int i = 3;i<arr.length;i++){
                arr[i] = arr[i-1] + arr[i-2];
            }
            System.out.println(arr[n]);
        }
    }
}
