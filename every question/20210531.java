这个题目并不困难，只需要生成一个n*m的地图，首先将有蘑菇的该点设置为-1，表示不能碰到蘑菇，那么从<1, 1>出发，可达<1, 1>的概率就是map[1][1] = 1,对于一般情况，map[i][j] = (map[i][j-1] + map[i-1][j]) / 2，其中，如果map[i][j]、 map[i][j-1]、 map[i-1][j]如果分别为-1， 则不计算对应部分，不过，对于i==n和j==m的情况下有所不同，因为此时只有一种移动方式，所以应该在多加上map[i][j-1]/2和map[i-1][j]/2，由此，map[n][m]就是达到终点的概率，代码如下：
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int[][] xy = new int[k][2];
            for (int i = 0; i < k; i++) {
                xy[i][0] = sc.nextInt();
                xy[i][1] = sc.nextInt();
            }
            System.out.printf("%.2f", solve(n, m, xy));
        }
    }
 
    private static double solve(int n, int m, int[][] xy) {
        double[][] map = new double[n + 1][m + 1];
        for (int[] a : xy) {
            map[a[0]][a[1]] = -1;
        }
        map[1][1] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (map[i][j] != -1) {
                    if (map[i - 1][j] != -1)
                        map[i][j] += j == m ? map[i - 1][j] : map[i - 1][j] / 2;
                    if (map[i][j - 1] != -1)
                        map[i][j] += i == n ? map[i][j - 1] : map[i][j - 1] / 2;
                }
 
            }
        }
        return map[n][m];
    }
}