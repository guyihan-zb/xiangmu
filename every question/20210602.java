假设a给b和c发邮件，有两种选择:
  第一种：a把给b的邮件给c,然后把给c的邮件给b（就是把他两的邮件互换），剩下N-2个人也都这么处理（就是N-2个子问题），那么就有f(n-2)种情况；
  第二种：a没有把给b的邮件给c，反而是给了其他的人，那么问题就转换成了N-1人的子问题，有f(n-1)种情况。

因此我们可以得出递推公式：f（n）=(n-1)*(f(n-1)+f(n-2))  (n>=3低于三个人没法玩)





import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            long sum = count(n);
            System.out.println(sum);
        }

    }

    //计算所有人都收不到自己的邮件的情况情况：错排算法
    private static long count(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return (n - 1) * (count(n - 1) + count(n - 2));
        }
    }
}