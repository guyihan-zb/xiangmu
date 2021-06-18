import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int n = Integer.parseInt(sc.nextLine());
            String[] arr = new String[n];
            for (int i = 0; i < n; i ++ ) {
                String s = sc.nextLine();
                if(s.contains(",") || s.contains(" ")) s = "\"" + s + "\"";
                arr[i] = s;
            }
            for (int i = 0; i < n; i ++ ) {
                if(i == n - 1) System.out.println(arr[i]);
                else System.out.print(arr[i] + ", ");
            }
        }
    }
}
