//判断能否形成等差数列

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int n = arr.length;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for (int v : arr) {
            if (min > v) {
                min = v;
            }
            if (max < v) {
                max = v;
            }
            set.add(v);
        }
        // 常数列
        if (min == max) {
            return true;
        }
        if ((max - min) % (n - 1) != 0 || set.size() != n) {
            return false;
        }
        // 公差
        int d = (max - min) / (n - 1);
        for (int v : arr) {
            if ((v - min) % d != 0) {
                return false;
            }
        }
        return true;
        }
}
