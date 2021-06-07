import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            Double n = sc.nextDouble();
            Double c = sc.nextDouble();
            if(n<=2*3.14*c){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}