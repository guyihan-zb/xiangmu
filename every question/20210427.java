import java.util.Scanner;
 
public class Main {
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n = scan.nextInt();
            int count = 0;
            String str = Integer.toBinaryString(n);
            char[] cha = str.toCharArray();
            for(char c :cha){
                if(c=='1'){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
 
}