import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //正则表达式，a-z是所有bai小写字母 A-Z是所有大写字母
        // [a-zA-Z]+ 这个就是一个不分大du小zhi写字母dao的英文单词（无限字母） 最少是一个字母
        //前面加个^就是除了这些字母外的其他字符
        String[] str1 = str.split("[^a-zA-Z]");
        StringBuffer sb = new StringBuffer();
        for(int i=str1.length-1;i>=0;i--){
            sb.append(str1[i]).append(" ");
        }
        System.out.println(sb.toString());
    }
}