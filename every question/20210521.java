import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        while (sc.hasNext()) {
            String str = sc.nextLine();
            for (int i = 0;i<str.length();i++) {
                if (str.charAt(i) >= 'A' && str.charAt(i) <='E') {
                    result.append((char)(str.charAt(i)+21));
                }else if(str.charAt(i) > 'E' && str.charAt(i) <='Z') {
                    result.append((char)(str.charAt(i) - 5));
                }else if (str.charAt(i) == ' ') {
                    result.append(' ');
                }
            }
            System.out.println(result);

	//清除上一次生成的字符串，以保证后面的字符串不会串行
            result.setLength(0);
        }
    }
}