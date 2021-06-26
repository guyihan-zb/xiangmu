例如ab，abc这样两者之间的字符串有aba、abb，而ab、bb两者之间的字符串有ac、ad、ae……az、ba这25个（这里规定长度为2），如果再包括长度为1的，则还有一个b也在范围内。

其次，所谓的长度在len1到len2的字符串个数，指的是长度在len1的字符串个数、长度在len1 + 1 …… 长度在len2的字符串个数。这是闭区间，len1，len2两头的情况也要考虑。

例如abcde、acede，如果要求其长度在1到4之间的字符串，那就是要找到a和a两个字符串之间的字符串个数（长度为1）ab和ac两个字符串之间的字符串个数（长度为2时），abc和ace之间的字符串个数（长度为3时）以及abcd和aced之间的（长度为4时）


import java.util.Scanner;

public class StrCount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
        String str1 = input.next();
        String str2 = input.next();

        int len1 = input.nextInt();
        int len2 = input.nextInt();

        // 获取两个字符串长度
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        int resNum = 0;
        // 定义一个长度为len2+1的数组，用于保存每个长度下两个字符串之间的字符串数
        int[] dp = new int[len2 + 1];
        // 从长度为1开始循环到len2结束，这里dp数组是从下标为1开始存储对应长度的字符数
        for (int i = 1; i <= len2; i++) {	
            // 每个长度下拥有的字符串个数为上一个长度下字符串个数乘以26（不是最终结果，后面还有加减操作）
            dp[i] = (dp[i - 1] * 26) % 1000007;
            // 如果长度没有超过str1，那么需要减去str1这一位置上的那个字符与96的差值（该值表示在范围之外的个数，也就是*26那步操作多计算进去的几个）
            if (i <= str1.length()) dp[i] = dp[i] - (ch1[i - 1] - 96);
            // 如果长度没有超过str2，那么需要加上str2这一位置上的哪个字符与96的差值（该值表示还有几个是上述*26没有算上了）
            if (i <= str2.length()) dp[i] = dp[i] + (ch2[i - 1] - 96);

            if (i >= len1) resNum += dp[i];
            }
            // 最后结束叠加时，需要-1，因为最后的长度下需要减去str2最后一个字符的自身情况
        System.out.println((resNum - 1) % 1000007);
        }
        input.close();
    }
}